package dadgamer.mrcrayfish.tutorial.proxy;

import dadgamer.mrcrayfish.tutorial.init.ModItems;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init() {
		ModItems.registerRenders();
	}

}
