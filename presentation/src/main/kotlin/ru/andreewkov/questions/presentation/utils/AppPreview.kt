package ru.andreewkov.questions.presentation.utils

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

private const val DeviceNexus7 = Devices.NEXUS_7
private const val DevicePixel2XL = Devices.PIXEL_2_XL
private const val DeviceLandscape = "spec:id=reference_phone,shape=Normal,width=891,height=411,unit=dp,dpi=420"
private const val DeviceTablet = Devices.TABLET

@Preview(
    device = DeviceNexus7,
    showBackground = true,
    uiMode = Configuration.UI_MODE_TYPE_UNDEFINED,
)
@Preview(
    device = DeviceLandscape,
    showBackground = true,
    uiMode = Configuration.UI_MODE_TYPE_UNDEFINED,
)
@Preview(
    device = DevicePixel2XL,
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    device = DeviceTablet,
    showBackground = true,
    uiMode = Configuration.UI_MODE_TYPE_UNDEFINED,
)
internal annotation class AppPreview
