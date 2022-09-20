# QuiltMC Kotlin Template

### What is Quilt?

[**QuiltMC**](https://quiltmc.org/)

| INCLUDED               | INFO                                              |
|------------------------|---------------------------------------------------|
| QuiltMC                | https://github.com/QuiltMC                        |
| Quilt Kotlin Libraries | https://github.com/QuiltMC/quilt-kotlin-libraries |
| ParchmentMC            | https://github.com/ParchmentMC                    |
| Kotlin                 | https://kotlinlang.org                            |

### Mixin

There are two ways to use mixins with Kotlin.

- First way
    - Normally use mixins like [this](src/main/java/com/example/examplemod/mixin/TitleScreenNormalMixin.java)
- Second way
    - Calling a kotlin function from java
    - Only in this case is hot swappable
    - Refer
      to [calling Kotlin functions from java](src/main/java/com/example/examplemod/mixin/binding/TitleScreenBindingMixin.java)
      and [kotlin function](src/main/kotlin/com/example/examplemod/mixin/TitleScreenBindingMixin.kt)
