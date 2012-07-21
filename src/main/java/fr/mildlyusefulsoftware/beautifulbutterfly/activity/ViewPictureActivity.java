package fr.mildlyusefulsoftware.beautifulbutterfly.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a14ff80e350ab61";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
		"http://1.bp.blogspot.com/-BYzDvm3eQYA/Tc1rv8nCZrI/AAAAAAAAAEc/Eg7Y0D55N-0/s1600/butterfly.jpg",
		"http://2.bp.blogspot.com/-x-FxG5R-HrA/T2QdjLoiJHI/AAAAAAAAAR8/lfFKIliwl5A/s1600/butterfly1+(1).jpg",
		"http://www.djibnet.com/photo/1561440998-the-wings-become-windows-butterfly.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/b/b5/Monarch_Butterfly_Danaus_plexippus_on_Echinacea_purpurea_2800px.jpg",
		"http://www.jblog.fr/wallpapers/jeux/papillons/Red-Lacewing-Butterfly.jpg",
		"http://www.djibnet.com/photo/143860670-blue-morpho-butterfly.jpg",
		"http://www.fwallpaper.net/pics/animals/butterfly/butterfly_5.jpg",
		"http://htcwallpaper.info/wp-content/uploads/2011/08/Butterfly-Wallpaper-640x471.jpg",
		"http://www.scientificillustrator.com/art/photography/insect-photos/morpho-achilles-butterfly-0041-600w.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Agraulis_vanillae_butterfly_from_above.JPG/640px-Agraulis_vanillae_butterfly_from_above.JPG",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Common_Lime_Butterfly_Papilio_demoleus_UP_by_Kadavoor.jpg/640px-Common_Lime_Butterfly_Papilio_demoleus_UP_by_Kadavoor.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/4/4b/Siproeta_epaphus_Galawebdesign.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/4/4f/Zebra_Swallowtail_Megan_McCarty10.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Teinopalpus_imperialis_verso.JPG/512px-Teinopalpus_imperialis_verso.JPG",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/a/af/MP_-_Birdwing_5.jpg/640px-MP_-_Birdwing_5.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/8/8c/Papilio_troilus01.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Swallowtail_butterfly.jpg/594px-Swallowtail_butterfly.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/d/db/Cairns_birdwing_-_melbourne_zoo.jpg/640px-Cairns_birdwing_-_melbourne_zoo.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/7/7f/Western_Tiger_Swallowtail_%28Papilio_Rutulus%29.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Spicebush_Swallowtail_in_August.jpg/640px-Spicebush_Swallowtail_in_August.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Papilio_troilus_Linne_%281%29.jpg/640px-Papilio_troilus_Linne_%281%29.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Lime_Butterfly_Papilio_demoleus.jpg/640px-Lime_Butterfly_Papilio_demoleus.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/5/5b/Lime_Butterfly_%28Papilio_demoleus%29_in_Hyderabad%2C_AP_W_IMG_0557.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Common_Lime_Butterfly_Papilio_demoleus_by_Kadavoor.JPG/640px-Common_Lime_Butterfly_Papilio_demoleus_by_Kadavoor.JPG",
		"http://upload.wikimedia.org/wikipedia/commons/2/26/Lime_Butterfly_%28Papilio_demoleus%29_in_Narshapur%2C_AP_W_IMG_0988.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Papilio_demoleus_ALT_by_kadavoor.jpg/615px-Papilio_demoleus_ALT_by_kadavoor.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Pieris_sp_3.jpg/640px-Pieris_sp_3.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/0/06/Green-veined_White_on_Dandelion.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Common_Jezebel_Delias_eucharis_edit_by_kadavoor.jpg/640px-Common_Jezebel_Delias_eucharis_edit_by_kadavoor.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/CommonJezebel.jpg/560px-CommonJezebel.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Common_Jezebel_Delias_eucharis_by_kadavoor_2.JPG/458px-Common_Jezebel_Delias_eucharis_by_kadavoor_2.JPG",
		"http://upload.wikimedia.org/wikipedia/commons/a/aa/Common_Jezebel_Delias_eucharis_I3_IMG_0765.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/a/ae/Common_Jezebel_%28Delias_eucharis%29_in_Hyderabad%2C_AP_W_IMG_9799.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/4/4a/Common_Jezebel_%28Delias_eucharis%29_on_Callistemon_viminalis_in_Hyderabad_W_IMG_0646.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Peablue_October_2007_Osaka_Japan.jpg/640px-Peablue_October_2007_Osaka_Japan.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Lycaeides_melissa_samuelis_%28cropped%29.jpg/640px-Lycaeides_melissa_samuelis_%28cropped%29.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Talicada_nyseus_%281%29.jpg/640px-Talicada_nyseus_%281%29.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/3/33/Talicada.nyseus.on.lily.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Brauner_W%C3%BCrfelfalter_%28Hamearis_lucina%29_02.jpg/600px-Brauner_W%C3%BCrfelfalter_%28Hamearis_lucina%29_02.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Lycaenidae_-_Riodininae_-_Hamearis_lucina.JPG/640px-Lycaenidae_-_Riodininae_-_Hamearis_lucina.JPG",
		"http://upload.wikimedia.org/wikipedia/commons/4/4f/Hamearis_lucina_lateral.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/PlumJudyJavadi.jpg/509px-PlumJudyJavadi.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/f/f0/Plum_Judy_%28Abisara_echerius%29-_Female_in_Talakona%2C_AP_W_IMG_8469.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/AbisaraEcheriusAC1.jpg/589px-AbisaraEcheriusAC1.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Butterflies_of_Kerala_Painted_Lady.JPG/610px-Butterflies_of_Kerala_Painted_Lady.JPG",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Butterfly_August_2008-3.jpg/593px-Butterfly_August_2008-3.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Monarch_Butterfly_Danaus_plexippus_Male_2664px.jpg/640px-Monarch_Butterfly_Danaus_plexippus_Male_2664px.jpg",
		"http://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Male_Zabulon_Skipper%2C_Megan_McCarty114.jpg/686px-Male_Zabulon_Skipper%2C_Megan_McCarty114.jpg"
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("beautifulbutterfly",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
