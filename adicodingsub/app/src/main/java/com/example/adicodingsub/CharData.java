package com.example.adicodingsub;

import java.util.ArrayList;

public class CharData {
    private static String[] charNames = {
            "Nezuko",
            "Tanjiro Kamado",
            "Kagaya Ubuyashiki",
            "Zenitsu Agatsuma",
            "Inosuke Hashibira",
            "Muzan Kibutsuji",
            "Shinobu Kocho",
            "Kanao Tsuyuri",
            "Kyojuro Rengoku",
            "Sakonji Urokodaki"
    };
    private static String[] charNamesFavorite = {
            "Nezuko as a favorite",
            "Tanjiro Kamado as a favorite",
            "Kagaya Ubuyashiki as a favorite",
            "Zenitsu Agatsuma as a favorite",
            "Inosuke Hashibira as a favorite",
            "Muzan Kibutsuji as a favorite",
            "Shinobu Kocho as a favorite",
            "Kanao Tsuyuri as a favorite",
            "Kyojuro Rengoku as a favorite",
            "Sakonji Urokodaki as a favorite"
    };


    private static String[] charDetails = {
            "Nezuko Kamado (竈門かまど 禰ね豆ず子こ Kamado Nezuko) is the deuteragonist of Demon Slayer: Kimetsu no Yaiba. She is a demon and the younger sister of Tanjiro Kamado and one of the two remaining members of the Kamado family. Formerly a human, she was attacked and turned into a demon by Muzan Kibutsuji.",
            "Tanjiro Kamado (竈門かまど 炭たん治じ郎ろう Kamado Tanjirō) is the main protagonist of Demon Slayer: Kimetsu no Yaiba. He is a Demon Slayer in the Demon Slayer Corps, who joined to find a remedy to turn his sister, Nezuko Kamado, back into a human and to hunt down and kill demons,[5] and later swore to defeat Muzan Kibutsuji,[6] the King of Demons, in order to prevent others from suffering the same fate as him",
            "Kagaya Ubuyashiki (産うぶ屋や敷しき  Ubuyashiki Kagaya) is a major supporting character of Demon Slayer: Kimetsu no Yaiba. He is the 97th leader of the Demon Slayer Corps[2] known mainly as Oyakata-sama (お館やかた様さま? lit. \"Master\") by his subordinates and peers and is also the head of the Ubuyashiki Family",
            "Zenitsu Agatsuma (我あが妻つま Agatsuma Zen'itsu) is one of the main protagonists of Demon Slayer: Kimetsu no Yaiba and along with Inosuke Hashibira, a travelling companion of Tanjiro Kamado and Nezuko Kamado. He is also a Demon Slayer in the Demon Slayer Corps.",
            "Inosuke Hashibira (嘴はし平びら 伊い之の助すけ Hashibira Inosuke) is one of the main protagonists of Demon Slayer: Kimetsu no Yaiba and along with Zenitsu Agatsuma, a traveling companion of Tanjiro Kamado and Nezuko Kamado. He is also a Demon Slayer in the Demon Slayer Corps.",
            "Muzan Kibutsuji (鬼き舞ぶ辻つじ 無む惨ざん Kibutsuji Muzan) is the main antagonist of Demon Slayer: Kimetsu no Yaiba. He is the Demon King, the first of his kind, as well as the progenitor of all other demons in existence. Muzan is also the leader of the Twelve Kizuki, an organization of the twelve strongest demons in existence that serve directly under him.",
            "Shinobu Kocho (胡こ蝶ちょう しのぶ Kochō Shinobu) is a major supporting character of Demon Slayer: Kimetsu no Yaiba. She is a Demon Slayer of the Demon Slayer Corps and the current Insect Hashira (蟲むし柱ばしら Mushi Bashira)",
            "Kanao Tsuyuri (栗つ花ゆ落り カナヲ Tsuyuri Kanao) is a major supporting character of Demon Slayer: Kimetsu no Yaiba. She is a Demon Slayer of the Demon Slayer Corps, Shinobu Kocho's Tsuguko and the adopted sister of Shinobu and Kanae Kocho.",
            "Kyojuro Rengoku (煉れん獄ごく 杏きょう寿じゅ郎ろう Rengoku Kyōjurō?) was a major supporting character of Demon Slayer: Kimetsu no Yaiba and a major character in the Mugen Train Arc. He was a Demon Slayer of the Demon Slayer Corps and the late Flame Hashira (炎えん柱ばしら En Bashira).",
            "Sakonji Urokodaki (鱗うろこ滝だき 左さ近こん次じ Urokodaki Sakonji) is a retired member of the Demon Slayer Corps, having held the position of the previous Water Hashira (水みず柱ばしら Mizu Bashira). He is the main cultivator of the Water Breathing, having trained Giyu Tomioka, Tanjiro Kamado, Sabito and Makomo."
    };
    private static String[] charDetailssec = {
            "Nezuko is a petite young girl with fair skin, visibly large, prominent fangs, and sharp, stiletto nails with a base color of light pink and ombre fading to a red-pinkish color at the end where they point. Her hair is long, black, and wavy. It reaches just below her waist, turning a flame-orange color as it passes her elbows, and appears to be crimped into large, straight ridges, worn side-swept drastically to her left. She has soft-looking, pale pink eyes that appear a lighter color around the rims of their irises, slanted downward toward the sides of her face and framed by notably long eyelashes, the pupils of which can appear slit as she transforms. In the manga, Nezuko can sometimes be shown with more than one bow. According to Tanjiro Kamado, Nezuko was known as a great beauty in their home town.",
            "Before he became a Demon Slayer, Tanjiro was a coal burner before his entire family was slaughtered by Muzan while his younger sister, Nezuko, was turned into a demon.Tanjiro is a young boy of average height with fairly tanned skin and an athletic, muscular physique. He has ruffled, black hair with burgundy tips, combed back to expose his forehead, and wide, dark red eyes with white pupils that appear lighter around the lower section of his irises. He also has a scar on the top left of his forehead, first seen when his mother brought him to watch his father perform the Hinokami Kagura dance. The scar originally looked somewhat like a graze until his fight with the Hand Demon during the Final Selection, after which it develops into a flame-like pattern as his Demon Slayer Mark.",
            "Kagaya has light skin and black shoulder length hair. He has a curse mark that is slowly killing him that also makes his skin look as if it was rotting spreading down his face and covering his eyes making him unable to see, by the time of his death this curse had spread all over his body making moving nearly impossible. Muzan at Kagaya's death described him as having the smile of a Buddha.\n" + "\n" + "He usually wears a black kimono over a white with a long white haori with a pink and purple flame-like pattern that starts from the furi in the calves and the fuki in the hem.",
            "Zenitsu is a young boy of average height with fair skin and downward-sloped, scared-looking eyes that fade from soft brown to gold. He has short, yellow hair of varying lengths, cutting off squarely at the ends where it fades to a darker orange color, that falls in front of his face in uneven bangs. Before he became a Demon Slayer, Zenitsu's hair was originally black, but it turned the color it is currently when he was struck by lightning during his training.",
            "Inosuke is a young man of average height and pale complexion with an extremely toned and muscular build for his age, possessing large, defined muscles most notably over his stomach and arms. In sharp contrast to this, he has an incredibly pretty and feminine face, with large, wide eyes that are framed by an array of long eyelashes, their irises a dark to soft pale green, thin eyebrows and what could be a small, well-mannered mouth. His thick, black hair reaches just past his shoulders, fading into blue at the tips and forming an unruly and uneven fringe that falls just above his eyes, puffing out before curving and thinning towards his forehead.",
            "A millennium ago, Muzan was turned into a demon while trying to cure his own terminal illness, and his goal since then was to live without the fear of death and become truly eternal. He plans to accomplish this in 2 ways: finding the Blue Spider Lily or creating more demons in hopes that one day one would be able to conquer their weakness of sunlight",
            "Shinobu Kocho is also the younger sister of Kanae Kocho along with her adoptive younger sister Kanao Tsuyuri. After a demon killed her parents, Shinobu joined the Demon Slayer Corps along with her sister in order to protect others from suffering the same fate as her.Shinobu is a petite young woman with a pale complexion and large, compound-like eyes that lack pupils, only a haze of gradient purple, making her eyes appear similar to those of insects. She has shoulder-length wavy hair that fades from black into dark purple, styled at the back of her head into a flat yakai-maki bun, fastened with a white, turquoise and light purple butterfly ornament.",
            "Kanao is a short, young girl with large, gentle eyes of a dark lilac color that are framed by thick eyelashes. She has thin black hair, worn tied into a ponytail on the right side of her head and fastened by a pink and green butterfly ornament that once belonged to her adoptive sister, Kanae Kocho.[3] She has a straight fringe and two loose, chin-length strands that curve downwards from above each of her ears.",
            "Kyojuro was a young adult of tall stature and athletic build. He is known to have an air of great optimism about him, having an enthusiastic smile plastered on his face nearly all the time. He had long bright yellow hair with red streaks akin to flames along with two shoulder-length bangs and two chin-length bangs on the side of his head, black forked eyebrows, and golden eyes that fade to red with white pupils.",
            "Sakonji's face has never once been revealed or depicted throughout the entire completed manga; he is always seen wearing a tengu mask that covers his entire face although Tanjiro states through a Taishō secret that Sakonji's face is very gentle and calm. He appears to be an elderly individual, as noted by the countless number of students he's trained, along with his silver-colored hair. In his youth, his hair was black and fashioned into a topknot."
    };
    private static int[] charImages = {
            R.drawable.confusenez,
            R.drawable.tanjiroone2,
            R.drawable.kagayaone,
            R.drawable.zenitsuone,
            R.drawable.inosukeone,
            R.drawable.muzansec,
            R.drawable.kanaoone,
            R.drawable.tsuruyione,
            R.drawable.kyojurosec,
            R.drawable.sakonjione
    };
    private static int[] charImagessec = {
            R.drawable.nexuko_sec,
            R.drawable.tanjiroone,
            R.drawable.kagayasec,
            R.drawable.zenitsusec,
            R.drawable.inosukesec,
            R.drawable.muzanone,
            R.drawable.kanaosec,
            R.drawable.tsuruisec,
            R.drawable.kyojuroone,
            R.drawable.sakonjisec
    };

    static ArrayList<DMNS> getListData() {
        ArrayList<DMNS> list = new ArrayList<>();
        for (int position = 0; position < charNames.length; position++) {
            DMNS DMNS = new DMNS();
            DMNS.setName(charNames[position]);
            DMNS.setDetail(charDetails[position]);
            DMNS.setFavoritename(charNamesFavorite[position]);
            DMNS.setMore_exp(charDetailssec[position]);
            DMNS.setPhoto(charImages[position]);
            DMNS.setPhoto_sec(charImagessec[position]);
            list.add(DMNS);
        }
        return list;
    }
}
