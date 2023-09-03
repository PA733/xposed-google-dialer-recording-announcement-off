# Google Dialer Recording Announcement Off

An Xposed/LSposed module that disables the call recording announcement
in the Google Dialer for dialer versions after 94.

## How it works

The call recording announcement has three implementations:

* TTS - Text To Speech synthesis of localised strings in the dialer
* Beep - A beep sound, only supported in some countries (determined by a `beepCountriesAvailable` PhenotypeDB configuration of the `com.google.android.dialer.directboot` package)
* Built-in Audio - An embedded audio file is played

The built-in audio file option doesn't seem to be used anymore, and since as of this
writing Beep doesn't seem to be deployed yet, TTS is essentially the only method used.

Since the TTS method relies on localised strings in the dialer resources,
this module uses the [resource replacement](https://github.com/rovo89/XposedBridge/wiki/Replacing-resources)
capability of Xposed/LSposed to simply set the relevant strings to the empty string.

## License

This code is licensed under the MIT license. See [LICENSE](LICENSE) for details.
