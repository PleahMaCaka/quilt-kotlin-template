package examplemod

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MODID = "examplemod"

object ExampleMod : ModInitializer {

    val LOGGER: Logger = LoggerFactory.getLogger("Example Mod")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("${mod.metadata().name()} is initialized!\nWelcome to the QuiltMC!")
    }

}

