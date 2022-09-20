package examplemod.mixinkt

import examplemod.ExampleMod

fun titleScreenBindingMixin(/*ci: CallbackInfo*/) {
    ExampleMod.LOGGER.info("TitleScreenBindingMixin!")
}
