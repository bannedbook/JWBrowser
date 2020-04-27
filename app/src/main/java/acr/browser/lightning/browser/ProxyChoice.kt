package acr.browser.lightning.browser

import acr.browser.lightning.preference.IntEnum

/**
 * The available proxy choices.
 */
enum class ProxyChoice(override val value: Int) : IntEnum {
    JWPROXY(6),
    NONE(0),
    ORBOT(1),
    I2P(2),
    MANUAL(3)
}
