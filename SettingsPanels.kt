class SettingsPanels {
    enum class SettingsType(val action: String) {
        Internet(Settings.Panel.ACTION_INTERNET_CONNECTIVITY),
        Volume(Settings.Panel.ACTION_VOLUME),
        NFC(Settings.Panel.ACTION_NFC),
        WiFi(Settings.Panel.ACTION_WIFI),
    }
    companion object {
        fun openPanel(activity: Activity, settingsType: SettingsType) {
            val intent = Intent(settingsType.action)
            activity.startActivityForResult(intent, settingsType.action.length)
        }
    }
}
