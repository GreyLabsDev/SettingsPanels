# SettingsPanels

Simple class for showing new settings panels on Android 10 from your application. But now this feature works only on API 29 (Android 10)

For example, to open network setting panel you can call this method
```
SettingsPanels.openPanel(<your_activity>, SettingsPanels.SettingsType.NFC)
```
Or open volume settings:
```
SettingsPanels.openPanel(<your_activity>, SettingsPanels.SettingsType.Volume)
```

How it looks:

![screenshoot](https://github.com/GreyLabsDev/SettingsPanels/blob/master/scr_one.png)
![screenshoot](https://github.com/GreyLabsDev/SettingsPanels/blob/master/scr_two.png)
