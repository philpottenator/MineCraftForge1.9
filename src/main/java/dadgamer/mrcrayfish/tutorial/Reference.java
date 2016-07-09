package dadgamer.mrcrayfish.tutorial;

public class Reference {
	
	public static final String MOD_ID ="dadgmrtutorial";
	public static final String NAME ="My First Mod Tutorial";
	public static final String VERSION ="1.0";
	public static final String ACCEPTED_VERSIONS ="{1.94}";

// Location of the class
	public static final String CLIENT_PROXY_CLASS ="dadgamer.mrcrayfish.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS ="dadgamer.mrcrayfish.tutorial.proxy.ServerProxy";

	public static enum TutorialItems{
		CHEESE("cheese", "ItemCheese" );
		
		private String unlocalizedName;
		private String registryName;
		
		
		TutorialItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
	}
	
}
