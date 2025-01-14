package net.tslat.smartbrainlib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ServiceLoader;

public class SBLConstants {
	public static final String MOD_ID = "forgebrainlib";
	public static final String MOD_NAME = "ForgeBrainLib";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static final SBLLoader SBL_LOADER = ServiceLoader.load(SBLLoader.class).findFirst().get();
}