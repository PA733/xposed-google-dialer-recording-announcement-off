package com.iscgar.android.xposed.dialer.recording_announcement_off;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;

public class AnnouncementOff implements IXposedHookInitPackageResources {
    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable {
        if (!resparam.packageName.equals("com.google.android.dialer")) {
            return;
        }

        resparam.res.setReplacement("com.google.android.dialer", "string", "call_recording_starting_voice", "");
        resparam.res.setReplacement("com.google.android.dialer", "string", "call_recording_ending_voice", "");
    }
}
