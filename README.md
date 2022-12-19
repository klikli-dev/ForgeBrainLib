# ForgeBrainLib

ForgeBrainLib is a fork of the open-source SmartBrainLib ( https://www.curseforge.com/minecraft/mc-mods/smartbrainlib ).

For more info see: https://www.curseforge.com/minecraft/mc-mods/forgebrainlib

# Wiki 

## Setup

Add the maven mirror to your `repositories{}` block in build.gradle:

```
repositories {    
    maven {    
        name = "KliKli Dev Repsy Maven"     
        url = "https://repo.repsy.io/mvn/klikli-dev/mods"    
        content {    
            includeGroup "com.klikli_dev"    
        }    
    }     
}   
```


Add a dependency to your `dependencies {}` block in build.gradle:

```    
dependencies {     
    //forgebrainlib     
    implementation fg.deobf("com.klikli_dev:forgebrainlib:1.19.3-1.0.0")     
}    
```

## Usage

ForgeBrainLib is binary compatible with SmartBrainLib, please refer to their wiki: [https://github.com/Tslat/SmartBrainLib/wiki](https://github.com/Tslat/SmartBrainLib/wiki)

