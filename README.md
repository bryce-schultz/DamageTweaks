# DamageTweaks
DamageTweaks is a lightweight spigot plugin used
to change mob damage to players. The basic concept
is that there is a damage modifier, this can be set
in either the config file (reload required), or by
a command in game.

### How to set the modifier
The modifier value is set at -1 or higher. A negative
value will decrease mob damage, 0 will leave it at
default and positive numbers will increase it.

### Basic configuration
| Config Value | Damage Value |
|:------------:|:------------:|
|1             |2x            | 
|.5            |1.5X          |
|.25           |1.25x         |
|0             |1x            |
|-.25          |.75x          |
|-.5           |.5x           |
|-1            |0x            | 

### Commands
| Command | Aliases | Permission |
|:-------:|:-------:|:----------:|
|`/setdamagemodifier` |`/setdm`, `/sdm`|`damagetweaks.setdamagemodifier`|
