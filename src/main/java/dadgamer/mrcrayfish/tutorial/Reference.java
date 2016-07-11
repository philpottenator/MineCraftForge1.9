package dadgamer.mrcrayfish.tutorial;

public class Reference {
	//enum for all constants needed by the game
	
	public static final String MOD_ID ="dadgamer";
	public static final String NAME ="My First Mod Tutorial";
	public static final String VERSION ="1.0";
	public static final String ACCEPTED_VERSIONS ="{1.94}";

// Location of the class
	public static final String CLIENT_PROXY_CLASS ="dadgamer.mrcrayfish.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS ="dadgamer.mrcrayfish.tutorial.proxy.ServerProxy";

	public static enum TutorialItems{
		//constructor for the items
		CHEESE("cheese", "ItemCheese" ),
		CRACKER("cracker", "ItemCracker" );
		
		private String unlocalizedName;
		private String registryName;
		
		
		TutorialItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	    public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	}
	
}
