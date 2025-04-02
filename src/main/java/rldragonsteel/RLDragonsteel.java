package rldragonsteel;

import com.github.alexthe666.iceandfire.integration.CompatLoadUtil;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rldragonsteel.integration.RLCombatCompat;

@Mod(modid = RLDragonsteel.MODID, dependencies = "required-after:llibrary@[" + RLDragonsteel.LLIBRARY_VERSION + ",)", version = RLDragonsteel.VERSION, name = RLDragonsteel.NAME)
public class RLDragonsteel {
    public static final String MODID = "rldragonsteel";
    public static final String VERSION = "1.0.0";
    public static final String LLIBRARY_VERSION = "1.7.9";
    public static final String NAME = "RLDragonsteel";
    public static final Logger logger = LogManager.getLogger(NAME);
    @Instance(value = MODID)
    public static RLDragonsteel INSTANCE;
    @SidedProxy(clientSide = "rldragonsteel.ClientProxy", serverSide = "rldragonsteel.CommonProxy")
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if (CompatLoadUtil.isRLCombatLoaded()) MinecraftForge.EVENT_BUS.register(RLCombatCompat.class);
        MinecraftForge.EVENT_BUS.register(PROXY);
    }
}
