import java.util.Arrays;
public class Hamilton {

    public static int maxi(int max, int washington){
        if(washington > max){
            max = washington;
        }
        return max;
    }

    public static void main(String [] args){
        //Alexander Hamilton
        String act1 = "How does a bastard, orphan, son of a whore\n" +
        "And a Scotsman, dropped in the middle of a forgotten spot\n" +
        "In the Caribbean by providence impoverished\n" +
        "In squalor, grow up to be a hero and a scholar?\n" +
        "The ten-dollar founding father without a father\n" +
        "Got a lot farther by working a lot harder\n" +
        "By being a lot smarter\n" +
        "By being a self-starter\n" +
        "By fourteen, they placed him in charge of a trading charter\n" +
        "And every day while slaves were being slaughtered and carted away\n" +
        "Across the waves, he struggled and kept his guard up\n" +
        "Inside, he was longing for something to be a part of\n" +
        "The brother was ready to beg, steal, borrow, or barter\n" +
        "Then a hurricane came, and devastation reigned\n" +
        "Our man saw his future drip, dripping down the drain\n" +
        "Put a pencil to his temple, connected it to his brain\n" +
        "And he wrote his first refrain, a testament to his pain\n" +
        "Well, the word got around, they said, this kid is insane, man\n" +
        "Took up a collection just to send him to the mainland\n" +
        "Get your education, don't forget from whence you came\n" +
        "And the world is gonna know your name\n" +
        "What's your name, man?\n" +
        "Alexander Hamilton\n" +
        "My name is Alexander Hamilton\n" +
        "And there's a million things I haven't done\n" +
        "But just you wait, just you wait\n" +
        "When he was ten his father split, full of it, debt-ridden\n" +
        "Two years later, see Alex and his mother bed-ridden\n" +
        "Half-dead sittin' in their own sick, the scent thick\n" +
        "And Alex got better but his mother went quick\n" +
        "Moved in with a cousin, the cousin committed suicide\n" +
        "Left him with nothin' but ruined pride, something new inside\n" +
        "A voice saying, \"Alex, you gotta fend for yourself\"\n" +
        "He started retreatin' and readin' every treatise on the shelf\n" +
        "There would have been nothin' left to do for someone less astute\n" +
        "He woulda been dead or destitute without a cent of restitution\n" +
        "Started workin', clerkin' for his late mother's landlord\n" +
        "Tradin' sugar cane and rum and all the things he can't afford\n" +
        "Scammin' for every book he can get his hands on\n" +
        "Plannin' for the future see him now as he stands on\n" +
        "The bow of a ship headed for the new land\n" +
        "In New York you can be a new man\n" +
        "In New York you can be a new man (just you wait)\n" +
        "In New York you can be a new man (just you wait)\n" +
        "In New York you can be a new man\n" +
        "In New York, New York\n" +
        "Just you wait\n" +
        "Alexander Hamilton\n" +
        "Alexander Hamilton\n" +
        "We are waiting in the wings for you\n" +
        "Waiting in the wings for you\n" +
        "You could never back down\n" +
        "You never learned to take your time\n" +
        "Oh, Alexander Hamilton\n" +
        "Alexander Hamilton\n" +
        "When America sings for you\n" +
        "Will they know what you overcame?\n" +
        "Will they know you rewrote your game?\n" +
        "The world will never be the same, oh\n" +
        "The ship is in the harbor now\n" +
        "See if you can spot him (just you wait)\n" +
        "Another immigrant comin' up from the bottom (just you wait)\n" +
        "His enemies destroyed his rep America forgot him\n" +
        "We, fought with him\n" +
        "Me, I died for him\n" +
        "Me, I trusted him\n" +
        "Me, I loved him\n" +
        "And me, I'm the damn fool that shot him (shot him, shot him)\n" +
        "There's a million things I haven't done\n" +
        "But just you wait\n" +
        "What's your name, man?\n" +
        "Alexander Hamilton\n" +
        //Aaron Burr, Sir
        "1776\n" +
        "New York City\n" +
        "Pardon me, are you Aaron Burr, sir?\n" +
        "That depends, who's asking?\n" +
        "Oh, sure, sir\n" +
        "I'm Alexander Hamilton, I'm at your service, sir\n" +
        "I have been looking for you\n" +
        "I'm getting nervous\n" +
        "Sir, I heard your name at Princeton\n" +
        "I was seeking an accelerated course of study\n" +
        "When I got sort of out of sorts with a buddy of yours\n" +
        "I may have punched him, it's a blur, sir\n" +
        "He handles the financials?\n" +
        "You punched the bursar?\n" +
        "Yes, I wanted to do what you did\n" +
        "Graduate in two, then join the revolution\n" +
        "He looked at me like I was stupid, I'm not stupid\n" +
        "So how'd you do it, how'd you graduate so fast?\n" +
        "It was my parent's dying wish before they passed\n" +
        "You're an orphan, of course\n" +
        "I'm an orphan\n" +
        "God, I wish there was a war\n" +
        "Then we could prove that we're worth more than anyone bargained for\n" +
        "Can I buy you a drink?\n" +
        "That would be nice\n" +
        "While we're talking, let me offer you some free advice\n" +
        "Talk less\n" +
        "What?\n" +
        "Smile more\n" +
        "Ha\n" +
        "Don't let them know what you're against or what you're for\n" +
        "You can't be serious\n" +
        "You wanna get ahead?\n" +
        "Yes\n" +
        "Fools who run their mouths off wind up dead\n" +
        "Aye, yo yo, yo yo, yo\n" +
        "What time is it?\n" +
        "Show time\n" +
        "Like I said\n" +
        "Show time, show time\n" +
        "Yo, I'm John Lauren's in the place to be (woo)\n" +
        "A-two pints o' Sam Adams, but I'm workin' on three, uh\n" +
        "Those redcoats don't want it with me\n" +
        "'Cause I will pop-chick-a pop these cops 'til I'm free\n" +
        "Aye, oui oui, mon ami, je m'appelle Lafayette\n" +
        "The Lancelot of the revolutionary set\n" +
        "I came from afar just to say bonsoir\n" +
        "Tell the king casse-toi\n" +
        "Who's the best? C'est moi\n" +
        "Brrah, brrah, I am Hercules Mulligan\n" +
        "Up in it, lovin' it, yes I heard ya mother said come again\n" +
        "Aye, lock up ya daughters and horses, of course\n" +
        "It's hard to have intercourse over four sets of corsets (wow)\n" +
        "No more sex, pour me another brew, son\n" +
        "Let's raise a couple more to the revolution\n" +
        "Well, if it ain't the prodigy of Princeton college\n" +
        "Aaron Burr\n" +
        "Give us a verse, drop some knowledge\n" +
        "Good luck with that, you're takin' a stand\n" +
        "You spit, I'ma sit\n" +
        "We'll see where we land (boo)\n" +
        "Burr, the revolution's imminent, to what do you stall for?\n" +
        "If you stand for nothing Burr, what'll you fall for?\n" +
        "Ooh, who are you?\n" +
        "Who are you\n" +
        "Who are you?\n" +
        "Ooh, who is this kid, what's he gonna do?\n" +
                //My Shot
        "I am not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "Hey yo, I'm just like my country\n" +
        "I'm young, scrappy and hungry\n" +
        "And I'm not throwin' away my shot\n" +
        "I'ma get a scholarship to King's College\n" +
        "I probably shouldn't brag, but dang, I amaze and astonish\n" +
        "The problem is I got a lot of brains but no polish\n" +
        "I gotta holler just to be heard\n" +
        "With every word, I drop knowledge\n" +
        "I'm a diamond in the rough, a shiny piece of coal\n" +
        "Tryna reach my goal my power of speech, unimpeachable\n" +
        "Only nineteen but my mind is older\n" +
        "These New York City streets get colder, I shoulder\n" +
        "Every burden, every disadvantage\n" +
        "I have learned to manage, I don't have a gun to brandish\n" +
        "I walk these streets famished\n" +
        "The plan is to fan this spark into a flame\n" +
        "But damn, it's getting dark, so let me spell out my name\n" +
        "I am the A-L-E-X-A-N-D-E-R we are meant to be\n" +
        "A colony that runs independently\n" +
        "Meanwhile, Britain keeps shittin' on us endlessly\n" +
        "Essentially, they tax us relentlessly\n" +
        "Then King George turns around, runs a spendin' spree\n" +
        "He ain't ever gonna set his descendants free\n" +
        "So there will be a revolution in this century\n" +
        "Enter me, he says in parentheses\n" +
        "Don't be shocked when your history book mentions me\n" +
        "I will lay down my life if it sets us free\n" +
        "Eventually, you'll see my ascendancy\n" +
        "And I am not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "Hey yo, I'm just like my country\n" +
        "I'm young, scrappy and hungry\n" +
        "And I'm not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "Hey yo, I'm just like my country\n" +
        "I'm young, scrappy and hungry\n" +
        "And I'm not throwin' away my shot\n" +
        "It's time to take a shot\n" +
        "I dream of life without a monarchy\n" +
        "The unrest in France will lead to anarchy?\n" +
        "Anarchy how you say, how you, oh, anarchy?\n" +
        "When I fight, I make the other side panicky\n" +
        "With my, shot\n" +
        "Yo, I'm a tailor's apprentice\n" +
        "And I got y'all knuckleheads in loco parentis (loco parentis)\n" +
        "I'm joining the rebellion 'cause I know it's my chance\n" +
        "To socially advance, instead of sewin' some pants (woo)\n" +
        "I'm gonna take a shot\n" +
        "And but we'll never be truly free\n" +
        "Until those in bondage have the same rights as you and me\n" +
        "You and I\n" +
        "Do or die\n" +
        "Wait 'til I sally in on a stallion\n" +
        "With the first black battalion\n" +
        "Have another shot\n" +
        "Geniuses, lower your voices\n" +
        "You keep out of trouble and you double your choices\n" +
        "I'm with you, but the situation is fraught\n" +
        "You've got to be carefully taught\n" +
        "If you talk, you're gonna get shot\n" +
        "Burr, check what we got\n" +
        "Mister Lafayette, hard rock like Lancelot\n" +
        "I think your pants look hot\n" +
        "Laurens, I like you a lot\n" +
        "Let's hatch a plot blacker than the kettle callin' the pot\n" +
        "What are the odds the gods would put us all in one spot\n" +
        "Poppin' a squat on conventional wisdom, like it or not\n" +
        "A bunch of revolutionary manumission abolitionists?\n" +
        "Give me a position, show me where the ammunition is\n" +
        "Oh, am I talkin' too loud?\n" +
        "Sometimes I get over excited, shoot off at the mouth\n" +
        "I never had a group of friends before\n" +
        "I promise that I'll make y'all proud\n" +
        "Let's get this guy in front of a crowd\n" +
        "I am not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "Hey yo, I'm just like my country\n" +
        "I'm young, scrappy and hungry\n" +
        "And I'm not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "Hey yo, I'm just like my country\n" +
        "I'm young, scrappy and hungry\n" +
        "And I'm not throwin' away my shot\n" +
        "Everybody sing\n" +
        "Whoa, whoa, whoa\n" +
        "Ayy, whoa (woo), whoa\n" +
        "Should let 'em hear ya (yeah)\n" +
        "Let's go\n" +
        "Whoa, whoa, whoa\n" +
        "I said shout it to the rooftops\n" +
        "Whoa, whoa, whoa\n" +
        "Said, to the rooftops\n" +
        "Whoa, whoa, whoa\n" +
        "A-come on (yeah)\n" +
        "Come on, let's go\n" +
        "Rise up\n" +
        "When you're living on your knees, you rise up\n" +
        "Tell your brother that he's gotta rise up\n" +
        "Tell your sister that she's gotta rise up\n" +
        "When are these colonies gonna rise up? (Whoa, whoa)\n" +
        "When are these colonies gonna rise up? (Whoa)\n" +
        "When are these colonies gonna rise up? (Whoa)\n" +
        "When are these colonies gonna rise up?\n" +
        "Rise up\n" +
        "I imagine death so much it feels more like a memory\n" +
        "When's it gonna get me?\n" +
        "In my sleep, seven feet ahead of me?\n" +
        "If I see it comin', do I run or do I let it be?\n" +
        "Is it like a beat without a melody?\n" +
        "See, I never thought I'd live past twenty\n" +
        "Where I come from some get half as many\n" +
        "Ask anybody why we livin' fast and we laugh, reach for a flask\n" +
        "We have to make this moment last, that's plenty\n" +
        "Scratch that this is not a moment, it's the movement\n" +
        "Where all the hungriest brothers with something to prove went?\n" +
        "Foes oppose us, we take an honest stand\n" +
        "We roll like Moses, claimin' our promised land\n" +
        "And? If we win our independence?\n" +
        "Is that a guarantee of freedom for our descendants?\n" +
        "Or will the blood we shed begin an endless cycle of vengeance and death with no defendants?\n" +
        "I know the action in the street is excitin'\n" +
        "But Jesus, between all the bleedin' 'n' fightin'\n" +
        "I've been readin' 'n' writin'\n" +
        "We need to handle our financial situation\n" +
        "Are we a nation of states what's the state of our nation?\n" +
        "I'm past patiently waitin' I'm passionately mashin' every expectation\n" +
        "Every action's an act of creation\n" +
        "I'm laughin' in the face of casualties and sorrow\n" +
        "For the first time, I'm thinkin' past tomorrow\n" +
        "And I am not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "Hey yo, I'm just like my country\n" +
        "I'm young, scrappy and hungry\n" +
        "And I'm not throwin' away my shot\n" +
        "We're gonna rise up (time to take a shot)\n" +
        "I am not throwin' away my shot\n" +
        "We're gonna rise up (time to take a shot)\n" +
        "I am not throwin' away my shot\n" +
        "We're gonna, rise up, rise up\n" +
        "It's time to take a shot\n" +
        "Rise up, rise up\n" +
        "It's time to take a shot\n" +
        "Rise up, it's time to take a shot\n" +
        "Rise up, take a shot, shot, shot\n" +
        "It's time to take a shot, time to take a shot\n" +
        "And I am not throwin' away my\n" +
        "Not throwin' away my shot\n" +
                //The Story of Tonight
        "I may not live to see our glory\n" +
        "I may not live to see our glory\n" +
        "But I will gladly join the fight\n" +
        "But I will gladly join the fight\n" +
        "And when our children tell our story\n" +
        "And when our children tell our story\n" +
        "They’ll tell the story of tonight\n" +
        "Let’s have another round tonight\n" +
        "Let’s have another round tonight\n" +
        "Let’s have another round tonight\n" +
        "Raise a glass to freedom\n" +
        "Something they can never take away\n" +
        "No matter what they tell you\n" +
        "Raise a glass to the four of us\n" +
        "Tomorrow there’ll be more of us\n" +
        "Telling the story of tonight\n" +
        "They’ll tell the story of tonight\n" +
        "Raise a glass to freedom\n" +
        "Something they can never take away\n" +
        "No matter what they tell you\n" +
        "Let’s have another round tonight\n" +
        "Raise a glass to the four of us\n" +
        "Tomorrow there’ll be more of us\n" +
        "Telling the story of tonight\n" +
        "Let’s have another round tonight\n" +
        "They’ll tell the story of tonight\n" +
        "Raise a glass to freedom\n" +
        "They’ll tell the story of tonight\n" +
        "Raise a glass to freedom\n" +
        "They’ll tell the story of tonight\n" +
        "They’ll tell the story of\n" +
        "Tonight\n" +
                //The Schyler Sisters
        "There's nothing rich folks love more\n" +
        "Than going downtown and slummin' it with the poor.\n" +
        "They pull up in their carriages and gawk\n" +
        "At the students in the common\n" +
        "Just to watch them talk.\n" +
        "Take Philip Schuyler: the man is loaded.\n" +
        "Uh-oh, but little does he know that\n" +
        "His daughters, Peggy, Angelica, Eliza\n" +
        "Sneak into the city just to watch all the guys at—\n" +
        "Work, work!\n" +
        "Angelica!\n" +
        "Work, work!\n" +
        "Eliza!\n" +
        "And Peggy!\n" +
        "The Schuyler sisters!\n" +
        "Angelica! Peggy! Eliza! Work!\n" +
        "Daddy said to be home by sundown.\n" +
        "Daddy doesn't need to know.\n" +
        "Daddy said not to go downtown.\n" +
        "Like I said, you're free to go.\n" +
        "But–look around, look around, the\n" +
        "Revolution's happening in New York (New York)\n" +
        "Angelica! Work!\n" +
        "It's bad enough daddy wants to go to war.\n" +
        "People shouting in the square.\n" +
        "It's bad enough there'll be violence on our shore.\n" +
        "New ideas in the air.\n" +
        "Look around, look around—\n" +
        "Angelica, remind me what we're looking for...\n" +
        "She's lookin' for me!\n" +
        "Eliza, I'm lookin' for a mind at work. (Work, Work)\n" +
        "I'm lookin for a mind at work! (Work, work!)\n" +
        "I'm lookin for a mind at work! (Work, work!)\n" +
        "Whooaaaaa! Whooaaaaa! (Work!)\n" +
        "Wooh! There's nothin' like summer in the city.\n" +
        "Someone in a rush next to someone lookin' pretty.\n" +
        "Excuse me, miss, I know it's not funny\n" +
        "But your perfume smells like your daddy's got money.\n" +
        "Why you slummin' in the city in your fancy heels\n" +
        "You searchin for an urchin who can give you ideals?\n" +
        "Burr, you disgust me.\n" +
        "Ah, so you've discussed me.\n" +
        "I'm a trust fund, baby, you can trust me!\n" +
        "I've been reading Common Sense by Thomas Paine.\n" +
        "So men say that I'm intense or I'm insane.\n" +
        "You want a revolution? I want a revelation\n" +
        "So listen to my declaration:\n" +
        "\"We hold these truths to be self-evident\n" +
        "That all men are created equal\"\n" +
        "And when I meet Thomas Jefferson,\n" +
        "I'm 'a compel him to include women in the sequel! (Work!)\n" +
        "Look around, look around at how\n" +
        "Lucky we are to be alive right now!\n" +
        "Look around, look around at how\n" +
        "Lucky we are to be alive right now!\n" +
        "History is happening in Manhattan and we\n" +
        "Just happen to be in the greatest city in the world!\n" +
        "In the greatest city in the world!\n" +
        "Cuz I've been reading Common Sense by Thomas Paine. (Look around, look around)\n" +
        "So men say that I'm intense or I'm insane.\n" +
        "(The revolution's happening in New York)\n" +
        "You want a revolution? I want a revelation\n" +
        "So listen to my declaration\n" +
        "We hold these truths to be self evident\n" +
        "That all men are created equal\n" +
        "Look around, Look around\n" +
        "At how lucky we are to be alive right now!\n" +
        "History is happening in Manhattan and we just\n" +
        "Happen to be\n" +
        "In the greatest city in the world\n" +
        "In the greatest city-\n" +
        "In the greatest city in the world!\n" +
        "Work, work!\n" +
        "Angelica! (Work, work!)\n" +
        "Eliza! (Work, work!) And Peggy!\n" +
        "The Schuyler sisters! (Work, work!)\n" +
        "We're looking for a mind at\n" +
        "Work, work! Hey!\n" +
        "Work, work! Hey!\n" +
        "Work, work! Whoa! Hey! Hey!\n" +
        "Work, work! Hey! Hey! Hey!\n" +
        "In the greatest Work, work!\n" +
        "In the greatest city in the\n" +
        "World\n" +
        "In the greatest city in the world!\n" +
                //Farmer Refuted
        "Hear ye, hear ye, my name is Samuel Seabury\n" +
        "And I present \"Free Thoughts on the Proceedings of the Continental Congress\"\n" +
        "Heed not the rabble who scream revolution\n" +
        "They have not your interests at heart\n" +
        "Oh my God, tear this dude apart\n" +
        "Chaos and bloodshed are not a solution\n" +
        "Don't let them lead you astray\n" +
        "This Congress does not speak for me\n" +
        "Let him be\n" +
        "They're playing a dangerous game\n" +
        "I pray the king shows you his mercy\n" +
        "For shame, for shame\n" +
        "Yo, he'd have you all unravel at the (heed not the rabble)\n" +
        "Sound of screams but the (who scream)\n" +
        "Revolution is comin' (revolution, they)\n" +
        "The have-nots are gonna (have not your)\n" +
        "Win this (interests)\n" +
        "It's hard to listen to you with a straight face (at heart)\n" +
        "Chaos and bloodshed already haunt us (chaos and bloodshed are not a)\n" +
        "Honestly, you shouldn't even talk (solution)\n" +
        "And what about Boston? (Don't let them)\n" +
        "Look at the cost, n' all that we've lost n' you talk (lead you astray)\n" +
        "About Congress? (this Congress does not speak for me)\n" +
        "My dog speaks more eloquently than thee\n" +
        "(they're playing a dangerous game)\n" +
        "But strangely, your mange is the same\n" +
        "(I pray the king shows you his mercy)\n" +
        "Is he in Jersey?\n" +
        "(For shame)\n" +
        "For the revolution\n" +
        "(For shame)\n" +
        "For the revolution\n" +
        "Heed\n" +
        "If you repeat yourself again I'm gonna\n" +
        "Scream\n" +
        "Honestly, look at me, please don't read\n" +
        "Not your interests\n" +
        "Don't modulate the key then not debate with me\n" +
        "Why should a tiny island across the sea regulate the price of tea?\n" +
        "Alexander, please\n" +
        "Burr, I'd rather be divisive than indecisive, drop the niceties\n" +
        "Silence, a message from the king\n" +
        "A message from the king\n" +
        "A message from the king\n" +
                //You'll Be Back
        "You say\n" +
        "The price of my love's not a price that you're willing to pay\n" +
        "You cry\n" +
        "In your tea which you hurl in the sea when you see me go by\n" +
        "Why so sad?\n" +
        "Remember we made an arrangement when you went away\n" +
        "Now you're making me mad\n" +
        "Remember, despite our estrangement, I'm your man\n" +
        "You'll be back, soon you'll see\n" +
        "You'll remember you belong to me\n" +
        "You'll be back, time will tell\n" +
        "You'll remember that I served you well\n" +
        "Oceans rise, empires fall\n" +
        "We have seen each other through it all\n" +
        "And when push comes to shove\n" +
        "I will send a fully armed battalion to remind you of my love!\n" +
        "Da da da dat da, dat da da da da ya da\n" +
        "Da da dat dat da ya da!\n" +
        "Da da da dat da, dat da da da da ya da\n" +
        "Da da dat dat da\n" +
        "You say our love is draining and you can't go on\n" +
        "You'll be the one complaining when I am gone\n" +
        "And no, don't change the subject\n" +
        "'Cause you're my favorite subject\n" +
        "My sweet, submissive subject\n" +
        "My loyal, royal subject\n" +
        "Forever, and ever, and ever, and ever, and ever\n" +
        "You'll be back like before\n" +
        "I will fight the fight and win the war\n" +
        "For your love, for your praise\n" +
        "And I'll love you 'til my dying days\n" +
        "When you're gone, I'll go mad\n" +
        "So don't throw away this thing we had\n" +
        "'Cause when push comes to shove\n" +
        "I will kill your friends and family to remind you of my love\n" +
        "Da da da dat da, dat da da da da ya da\n" +
        "Da da dat dat da ya da!\n" +
        "Da da da dat da, dat da da da da ya da\n" +
        "Da da dat-\n" +
        "Everybody!\n" +
        "Da da da dat da, dat da da da da ya da\n" +
        "Da da dat dat da ya da!\n" +
        "Da da da dat da, dat da da da da ya da, da da da\n" +
        "Dat dat da ya da!\n" +
                //Right Hand Man
        "British Admiral Howe's got troops on the water\n" +
        "Thirty-two thousand troops in New York harbor\n" +
        "Thirty-two thousand troops in New York harbor\n" +
        "When they surround our troops\n" +
        "They surround our troops\n" +
        "When they surround our troops\n" +
        "As a kid in the Caribbean I wished for a war\n" +
        "I knew that I was poor\n" +
        "I knew it was the only way to\n" +
        "Rise up\n" +
        "If they tell my story\n" +
        "I am either gonna die on the battlefield in glory or\n" +
        "Rise up\n" +
        "We will fight for this land\n" +
        "But there's only one man\n" +
        "Who can give us a command so we can\n" +
        "Rise up\n" +
        "Understand? It's the only way to\n" +
        "Rise up\n" +
        "Rise up\n" +
        "Here he comes\n" +
        "Here comes the general\n" +
        "Ladies and gentlemen\n" +
        "Here comes the general\n" +
        "The moment you've been waiting for\n" +
        "Here comes the general\n" +
        "The pride of Mount Vernon\n" +
        "Here comes the general\n" +
        "George Washington\n" +
        "We are outgunned (what?)\n" +
        "Outmanned (what?)\n" +
        "Outnumbered\n" +
        "Outplanned (buck, buck, buck, buck, buck)\n" +
        "We gotta make an all out stand\n" +
        "Ayo, I'm gonna need a right-hand man (buck, buck, buck, buck, buck)\n" +
        "Check it\n" +
        "Can I be real a second?\n" +
        "For just a millisecond?\n" +
        "Let down my guard and tell the people how I feel a second?\n" +
        "Now I'm the model of a modern major general\n" +
        "The venerated Virginian veteran whose men are all\n" +
        "Lining up, to put me up on a pedestal\n" +
        "Writin' letters to relatives\n" +
        "Embellishin' my elegance and eloquence\n" +
        "But the elephant is in the room\n" +
        "The truth is in ya face when ya hear the British cannons go\n" +
        "Boom\n" +
        "Any hope of success is fleeting\n" +
        "How can I keep leading when the people I'm\n" +
        "Leading keep retreating?\n" +
        "We put a stop to the bleeding as the British take Brooklyn\n" +
        "Knight takes rook, but look\n" +
        "We are outgunned (what?)\n" +
        "Outmanned (what?)\n" +
        "Outnumbered\n" +
        "Outplanned (buck, buck, buck, buck, buck)\n" +
        "We gotta make an all out stand\n" +
        "Ayo, I'm gonna need a right-hand man (buck, buck, buck, buck, buck)\n" +
        "Incoming\n" +
        "They're battering down the Battery check the damages\n" +
        "Rah\n" +
        "We gotta stop 'em and rob 'em of their advantages\n" +
        "Rah\n" +
        "Let's take a stand with the stamina God has granted us\n" +
        "Hamilton won't abandon ship\n" +
        "Yo, let's steal their cannons\n" +
        "Shh-boom\n" +
        "Goes the cannon, watch the blood and the shit spray and\n" +
        "Boom\n" +
        "Goes the cannon, we're abandonin' Kips Bay and\n" +
        "Boom\n" +
        "There's another ship and\n" +
        "Boom\n" +
        "We just lost the southern tip and\n" +
        "Boom\n" +
        "We gotta run to Harlem quick, we can't afford another slip\n" +
        "Guns and horses giddyup\n" +
        "I decide to divvy up\n" +
        "My forces, they're skittish as the British cut the city up\n" +
        "This close to giving up, facing mad scrutiny\n" +
        "I scream in the face of this mass mutiny\n" +
        "Are these the men with which I am to defend America?\n" +
        "We ride at midnight, Manhattan in the distance\n" +
        "I cannot be everywhere at once, people\n" +
        "I'm in dire need of assistance\n" +
        "Your excellency, sir\n" +
        "Who are you?\n" +
        "Aaron Burr, Sir?\n" +
        "Permission to state my case?\n" +
        "As you were\n" +
        "Sir\n" +
        "I was a captain under General Montgomery\n" +
        "Until he caught a bullet in the neck in Quebec\n" +
        "And well, in summary\n" +
        "I think that I could be of some assistance\n" +
        "I admire how you keep firing on the British\n" +
        "From a distance\n" +
        "Huh\n" +
        "I have some questions, a couple of suggestions on how to fight instead of fleeing west\n" +
        "Yes?\n" +
        "Well\n" +
        "Your excellency, you wanted to see me?\n" +
        "Hamilton, come in, have you met Burr?\n" +
        "Yes, sir\n" +
        "We keep meeting\n" +
        "As I was saying, sir, I look forward to seeing your strategy play out\n" +
        "Burr?\n" +
        "Sir?\n" +
        "Close the door on your way out\n" +
        "Have I done something wrong, sir?\n" +
        "On the contrary\n" +
        "I called you here because our odds are beyond scary\n" +
        "Your reputation precedes you, but I have to laugh\n" +
        "Sir?\n" +
        "Hamilton, how come no one can get you on their staff?\n" +
        "Sir\n" +
        "Don't get me wrong, you're a young man, of great renown\n" +
        "I know you stole British cannons when we were still downtown\n" +
        "Nathaniel Green and Henry Knox wanted to hire you\n" +
        "To be their Secretary? I don't think so\n" +
        "Why're you upset?\n" +
        "I'm not\n" +
        "It's alright, you want to fight, you've got a hunger\n" +
        "I was just like you when I was younger\n" +
        "Head full of fantasies of dyin' like a martyr?\n" +
        "Yes\n" +
        "Dying is easy, young man\n" +
        "Living is harder\n" +
        "Why are you telling me this?\n" +
        "I'm being honest\n" +
        "I'm working with a third of what our Congress has promised\n" +
        "We are a powder keg about to explode\n" +
        "I need someone like you to lighten the load\n" +
        "So?\n" +
        "I am not throwin' away my shot\n" +
        "I am not throwin' away my shot\n" +
        "Ayo, I'm just like my country, I'm young\n" +
        "Scrappy and hungry\n" +
        "I am not throwing away my shot\n" +
        "Son\n" +
        "We are outgunned, outmanned\n" +
        "You need all the help you can get\n" +
        "I have some friends, Laurens, Mulligan\n" +
        "Marquis de Lafayette, okay, what else?\n" +
        "Outnumbered, outplanned\n" +
        "We'll need some spies on the inside\n" +
        "Some King's men who might let some things slide\n" +
        "I'll write to Congress and tell 'em we need supplies\n" +
        "You rally the guys, master the element of surprise\n" +
        "I'll rise above my station, organize your information\n" +
        "'Til we rise to the occasion of our new nation, sir\n" +
        "Here comes the general\n" +
        "Rise up\n" +
        "Here comes the general\n" +
        "Rise up\n" +
        "Here comes the general\n" +
        "Rise up\n" +
        "Here comes the general\n" +
        "And his right hand man\n" +
        "Boom\n" +
                //A Winter's Ball
        "How does the bastard, orphan, son of a whore\n" +
        "Go on and on\n" +
        "Grow into more of a phenomenon?\n" +
        "Watch this obnoxious, arrogant, loudmouth bother\n" +
        "Be seated at the right hand of the father\n" +
        "Washington hires Hamilton right on sight\n" +
        "But Hamilton still wants to fight, not write\n" +
        "Now Hamilton's skill with a quill is undeniable\n" +
        "But what do we have in common\n" +
        "We're reliable with the\n" +
        "Ladies\n" +
        "There are so many to deflower\n" +
        "Ladies\n" +
        "Looks\n" +
        "Proximity to power\n" +
        "Ladies\n" +
        "They delighted and distracted him\n" +
        "Martha Washington named her feral tomcat after him\n" +
        "That's true\n" +
        "Seventeen-eighty\n" +
        "A winter's ball\n" +
        "And the Schuyler sisters are the envy of all\n" +
        "Yo, if you can marry a sister, you're rich, son\n" +
        "Is it a question of if, Burr, or which one?\n" +
        "Hey\n" +
        "Hey\n" +
        "Hey hey, hey, hey, hey, hey\n" +
                //Helpless
        "Ohh, I do I do I do I Dooo! Hey!\n" +
        "Ohh, I do I do I do I Dooo!\n" +
        "Boy, you got me helpless!\n" +
        "Look into your eyes, and the sky's the limit I'm\n" +
        "Helpless!\n" +
        "Down for the count, and I'm drownin' in 'em\n" +
        "I have never been the type to try and grab the spotlight\n" +
        "We were at a revel with some rebels on a hot night\n" +
        "Laughin' at my sister as she's dazzling the room\n" +
        "Then you walked in and my heart went\n" +
        "\"Boom!\"\n" +
        "Tryin' to catch your eye from the side of the ballroom\n" +
        "Everybody's dancin' and the band's top volume\n" +
        "Grind to the rhythm as we wine and dine\n" +
        "Grab my sister, and whisper\n" +
        "\"Yo, this one's mine.\" (Oooh)\n" +
        "My sister made her way across the room to you (Oooh)\n" +
        "And I got nervous, thinking\n" +
        "\"What's she gonna do?\" (Oooh)\n" +
        "She grabs you by the arm, I'm thinkin'\n" +
        "\"I'm through\" (Oooh)\n" +
        "Then you look back at me and suddenly I'm\n" +
        "Helpless!\n" +
        "Look into your eyes (Oh, look at those eyes)\n" +
        "And the sky's the limit (Oh!)\n" +
        "I'm helpless (I know)\n" +
        "Down for the count\n" +
        "And I'm drownin' in 'em\n" +
        "I'm helpless! (I'm so into you)\n" +
        "Look into your eyes (I am so)\n" +
        "And the sky's the limit (into you)\n" +
        "I'm helpless! (I know)\n" +
        "I'm down for the count\n" +
        "And I'm drownin' in 'em\n" +
        "Where are you taking me?\n" +
        "I'm about to change your life\n" +
        "Then by all means, lead the way\n" +
        "Elizabeth Schuyler. It's a pleasure to meet you\n" +
        "Schuyler?\n" +
        "My sister\n" +
        "Thank you for all your service\n" +
        "If it takes fighting a war for us to meet\n" +
        "It will have been worth it\n" +
        "I'll leave you to it\n" +
        "One week later\n" +
        "I'm writin' a letter nightly\n" +
        "Now my life gets better\n" +
        "Every letter that you write me\n" +
        "Laughin' at my sister, 'cause she wants to form a harem\n" +
        "I'm just sayin', if you really loved me\n" +
        "You would share him\n" +
        "Ha! Two weeks later\n" +
        "In the living room stressin'\n" +
        "My father's stonefaced\n" +
        "While you're asking for his blessin'\n" +
        "I'm dying inside, as you wine and dine\n" +
        "And I'm tryin' not to cry\n" +
        "'Cause there's nothing that your mind can't do (Oooh)\n" +
        "My father makes his way across the room to you (Oooh)\n" +
        "I panic for a second, thinking\n" +
        "\"We're through\" (Oooh)\n" +
        "But then he shakes your hand and says\n" +
        "\"Be true\" (Oooh)\n" +
        "And you turn back to me, smiling, and I'm\n" +
        "Helpless!\n" +
        "Look into your eyes\n" +
        "And the sky's the limit, I'm\n" +
        "Helpless!\n" +
        "Down for the count (Woo)\n" +
        "And I'm drownin' in 'em\n" +
        "I'm helpless!\n" +
        "He's mine, that boy is mine!\n" +
        "Look into your eyes\n" +
        "And the sky's the limit, I'm\n" +
        "Helpless! Helpless!\n" +
        "Down for the count, and I'm drownin' in 'em\n" +
        "Eliza, I don't have a dollar to my name\n" +
        "An acre of land, a troop to command\n" +
        "A dollop of fame\n" +
        "All I have's my honor, a tolerance for pain\n" +
        "A couple of college credits and my top-notch brain\n" +
        "Insane, your family brings out a different side of me\n" +
        "Peggy confides in me, Angelica tried to take a bite of me\n" +
        "No stress, my love for you is never in doubt\n" +
        "We'll get a little place in Harlem and we'll figure it out\n" +
        "I've been livin' without a family since I was a child\n" +
        "My father left, my mother died, I grew up buckwild\n" +
        "But I'll never forget my mother's face, that was real\n" +
        "And long as I'm alive, Eliza, swear to God, you'll never feel so\n" +
        "I do I do I do I do!\n" +
        "Eliza (Helpless!)\n" +
        "I do I do I do I do!\n" +
        "I've never felt so-\n" +
        "Helpless! (Hey! Yeah, yeah!)\n" +
        "Down for the count and\n" +
        "I'm drownin' in 'em (Down for the count I'm)\n" +
        "My life is gon' be fine cuz Eliza's in it\n" +
        "I look into your eyes, and the sky's the limit I'm (Helpless!)\n" +
        "Down for the count\n" +
        "And I'm drownin' in 'em\n" +
        "In New York, you can be a new man\n" +
        "In New York, you can be a new man\n" +
        "In New York, you can be a new man\n" +
        "Helpless!\n" +
                //Satisfied
        "All right, all right, that's what I'm talking about!\n" +
        "Now, everyone give it up for the maid of honor, Angelica Schuyler!\n" +
        "A toast to the groom!\n" +
        "To the groom, to the groom (to the groom)\n" +
        "To the bride!\n" +
        "To the bride. To the bride (to the bride)\n" +
        "From your sister\n" +
        "Angelica, Angelica, Angelica\n" +
        "Who is always by your side\n" +
        "(By your side, by your side)\n" +
        "To your union\n" +
        "To the union! (To the union)\n" +
        "To the revolution!\n" +
        "And the hope that you provide\n" +
        "You provide (You provide)\n" +
        "May you always (Always)\n" +
        "Be satisfied\n" +
        "(Rewind)\n" +
        "Rewind\n" +
        "Rewind\n" +
        "Helpless... Skies... skies...\n" +
        "Drownin' in 'em... Drowning\n" +
        "Rewind\n" +
        "I remember that night I just might (rewind!)\n" +
        "I remember that night I just might (rewind)\n" +
        "I remember that night,\n" +
        "I remember that...\n" +
        "I remember that night, I just might\n" +
        "Regret that night for the rest of my days\n" +
        "I remember those soldier boys\n" +
        "Tripping over themselves to win our praise\n" +
        "I remember that dreamlike candlelight\n" +
        "Like a dream that you can't quite place\n" +
        "But Alexander, I'll never forget the first time I saw your face\n" +
        "I have never been the same\n" +
        "Intelligent eyes in a hunger-pang frame\n" +
        "And when you said \"Hi, \" I forgot my dang name\n" +
        "Set my heart aflame, ev'ry part aflame\n" +
        "This is not a game\n" +
        "You strike me as a woman who has never been satisfied\n" +
        "I'm sure I don't know what you mean\n" +
        "You forget yourself\n" +
        "You're like me, I'm never satisfied\n" +
        "Is that right?\n" +
        "I have never been satisfied\n" +
        "My name is Angelica Schuyler\n" +
        "Alexander Hamilton\n" +
        "Where's your family from?\n" +
        "Unimportant, there's a million things I haven't done\n" +
        "Just you wait, just you wait\n" +
        "So so so...\n" +
        "So this is what it feels like to match wits\n" +
        "With someone at your level! what the hell is the catch?\n" +
        "It's the feeling of freedom, of seeing the light\n" +
        "It's Ben Franklin with a key and a kite\n" +
        "You see it right?\n" +
        "The conversation lasted two minutes, maybe three minutes, everything we said in total agreement!\n" +
        "It's a dream and it's a bit of a dance\n" +
        "A bit of a posture, it's a bit of a stance.\n" +
        "He's a bit of a flirt, but I'mma give it a chance\n" +
        "I asked about his fam'ly, did you see his answer?\n" +
        "His hands started fidgeting, he looked askance\n" +
        "He's penniless, he's flying by the seat of his pants\n" +
        "Handsome, boy does he know it\n" +
        "Peach fuzz and he can't even grow it\n" +
        "I wanna take him far away from this place\n" +
        "Then I turn and see my sister's face and she is\n" +
        "Helpless\n" +
        "And I know she is\n" +
        "Helpless\n" +
        "And her eyes are just\n" +
        "Helpless\n" +
        "And I realize\n" +
        "Three fundamental truths at the exact same time\n" +
        "Where are you taking me?\n" +
        "I'm about to change your life\n" +
        "Then by all means, lead the way\n" +
        "Number one!\n" +
        "I'm a girl in a world in which\n" +
        "My only job is to marry rich\n" +
        "My father has no sons so I'm the one\n" +
        "Who has to social climb for one\n" +
        "So I'm the oldest and the wittiest and the gossip in\n" +
        "New York City is insidious\n" +
        "And Alexander is penniless\n" +
        "Ha, that doesn't mean I want him any less\n" +
        "Elizabeth Schuyler, it's a pleasure to meet you\n" +
        "Schuyler?\n" +
        "My sister!\n" +
        "Number two!\n" +
        "He's after me because I'm a Schuyler sister\n" +
        "That elevates his status, I'd\n" +
        "Have to be naive to set that aside\n" +
        "Maybe that is why I introduce him to Eliza\n" +
        "Now that's his bride\n" +
        "Nice going Angelica, he was right, you will never be satisfied\n" +
        "Thank you for all your service\n" +
        "If it takes fighting a war for us to meet, it will have been worth it\n" +
        "I'll leave you to it!\n" +
        "Number three!\n" +
        "I know my sister like I know my own mind\n" +
        "You will never find anyone as trusting or as kind\n" +
        "If I tell her that I love him she'd be silently resigned\n" +
        "He'd be mine\n" +
        "She would say \"I'm fine\"\n" +
        "She'd be lying\n" +
        "But when I fantasize at night, it's Alexander's eyes\n" +
        "As I romanticize what might have been if I hadn't sized\n" +
        "Him up so quickly\n" +
        "At least my dear Eliza's his wife\n" +
        "At least I keep his eyes in my life\n" +
        "To the groom!\n" +
        "To the groom, to the groom, to the groom\n" +
        "To the bride!\n" +
        "To the bride\n" +
        "To the bride (to the bride)\n" +
        "From your sister\n" +
        "Angelica, Angelica, Angelica\n" +
        "Who is always by your side\n" +
        "By your side, by your side\n" +
        "To your union\n" +
        "To the union!\n" +
        "To the revolution!\n" +
        "And the hope that you provide\n" +
        "You provide. You provide\n" +
        "May you always\n" +
        "Always\n" +
        "Be satisfied\n" +
        "Satisfied, (satisfied), satisfied\n" +
        "And I know (be satisfied) ((be satisfied)) (be satisfied)\n" +
        "She'll be happy as his bride (satisfied, satisfied, satisfied)\n" +
        "And I know ((be satisfied)) (satisfied, satisfied, satisfied)\n" +
        "((be satisfied))\n" +
        "He will never be satisfied\n" +
        "I will never be satisfied\n" +
                //The Story of Tonight (Reprise)
        "I may not live to see our glory\n" +
        "I may not live to see our glory\n" +
        "But I've seen wonders great and small\n" +
        "I've seen wonders great and small\n" +
        "'Cause if the tomcat can get married\n" +
        "If Alexander can get married\n" +
        "There's hope for our ass, after all\n" +
        "Raise a glass to freedom\n" +
        "Hey\n" +
        "Something you will never see again\n" +
        "No matter what she tells you\n" +
        "Let's have another round tonight\n" +
        "Raise a glass to the four of us\n" +
        "Ho\n" +
        "To the newly not poor of us\n" +
        "Woo-hoo\n" +
        "We'll tell the story of tonight\n" +
        "Let's have another round\n" +
        "Well, if it isn't Aaron Burr\n" +
        "Sir\n" +
        "I didn't think that you would make it\n" +
        "To be sure\n" +
        "Burr\n" +
        "I came to say congratulations\n" +
        "Spit a verse, Burr\n" +
        "I see the whole gang is here\n" +
        "You are the worst, Burr\n" +
        "Ignore them\n" +
        "Congrats to you, Lieutenant Colonel\n" +
        "I wish I had your command instead of manning George's journal\n" +
        "No, you don't\n" +
        "Yes, I do\n" +
        "Now, be sensible\n" +
        "From what I hear, you've made yourself indispensable\n" +
        "Well, well, I heard\n" +
        "You've got a special someone on the side, Burr\n" +
        "Is that so?\n" +
        "What are you tryin' to hide, Burr?\n" +
        "I should go\n" +
        "No, these guys should go\n" +
        "What?\n" +
        "No\n" +
        "Leave us alone\n" +
        "Man\n" +
        "It's alright, Burr\n" +
        "I wish you'd brought this girl with you tonight, Burr\n" +
        "You're very kind, but I'm afraid it's unlawful, sir\n" +
        "What do you mean?\n" +
        "She's married\n" +
        "I see\n" +
        "She's married to a British officer\n" +
        "Oh shit\n" +
        "Congrats again, Alexander\n" +
        "Smile more\n" +
        "I'll see you on the other side of the war\n" +
        "I will never understand you\n" +
        "If you love this woman, go get her\n" +
        "What are you waiting for?\n" +
        "I'll see you on the other side of the war\n" +
        "I'll see you on the other side of the war\n" +
                //Wait For It
        "Theodosia writes me a letter ev'ry day.\n" +
        "I'm keeping her bed warm while her husband is away.\n" +
        "He's on the British side in Georgia.\n" +
        "He's tryin' to keep the colonies in line.\n" +
        "But he can keep all of Georgia.\n" +
        "Theodosia, she's mine.\n" +
        "Love doesn't discriminate\n" +
        "Between the sinners\n" +
        "And the saints\n" +
        "It takes and it takes and it takes\n" +
        "And we keep loving anyway.\n" +
        "We laugh and we cry and we break\n" +
        "And we make our mistakes.\n" +
        "And if there's a reason I'm by her side\n" +
        "When so many have tried\n" +
        "Then I'm willing to wait for it.\n" +
        "I'm willing to wait for it.\n" +
        "My grandfather\n" +
        "Was a fire and brimstone\n" +
        "Preacher, Preacher, preacher, preacher\n" +
        "But there are things that the homilies and hymns\n" +
        "Won't teach ya. Teach ya, teach ya, teach ya\n" +
        "My mother was a genius, Genius\n" +
        "My father commanded respect. Respect, respect\n" +
        "When they died they left no instructions.\n" +
        "Just a legacy to protect.\n" +
        "Death doesn't discriminate\n" +
        "Between the sinners and the saints\n" +
        "It takes and it takes and it takes\n" +
        "And we keep living anyway.\n" +
        "We rise and we fall and we break\n" +
        "And we make our mistakes.\n" +
        "And if there's a reason I'm still alive\n" +
        "When everyone who loves me has died\n" +
        "I'm willing to wait for it.\n" +
        "I'm willing to wait for it.\n" +
        "Wait for it Wait for it\n" +
        "Wait for it Wait for it\n" +
        "I am the one thing in life I can control\n" +
        "Wait for it Wait for it\n" +
        "Wait for it Wait for it\n" +
        "I am inimitable I am an original\n" +
        "Wait for it Wait for it\n" +
        "Wait for it Wait for it\n" +
        "I'm not falling behind or running late\n" +
        "Wait for it Wait for it\n" +
        "Wait for it Wait for it\n" +
        "I'm not standing still\n" +
        "I am lying in wait Wait\n" +
        "Wait Wait\n" +
        "Hamilton faces an endless uphill climb Climb Climb Climb\n" +
        "He has something to prove he has nothing to lose\n" +
        "Lose Lose Lose Lose\n" +
        "Hamilton's pace is relentless\n" +
        "He wastes no time Time Time Time\n" +
        "What is it like in his shoes?\n" +
        "Hamilton doesn't hesitate.\n" +
        "He exhibits no restraint.\n" +
        "He takes and he takes and he takes\n" +
        "And he keeps winning anyway.\n" +
        "He changes the game.\n" +
        "He plays and he raises the stakes.\n" +
        "And if there's a reason\n" +
        "He seems to thrive when so few survive\n" +
        "Then Goddamnit I'm willing to wait for it.\n" +
        "I'm willing to wait for it...\n" +
        "I'm willing to wait for it...\n" +
        "Life doesn't discriminate\n" +
        "Between the sinners and the saints\n" +
        "It takes and it takes and it takes.\n" +
        "And we keep living anyway\n" +
        "We rise and we fall and we break\n" +
        "We fall and we make our mistakes.\n" +
        "And if there's a reason I'm still alive\n" +
        "When so many have died\n" +
        "Then I'm willin' to- then I'm willin' to-\n" +
        "Wait for it... Wait for it... Wait for it...\n" +
        "Wait for it... Wait for it... Wait for it...\n" +
        "Wait for it... Wait for it... Wait for it...\n" +
        "Wait for it... Wait for it... Wait...\n" +
                //Stay Alive
        "Stay alive…\n" +
        "Stay alive…\n" +
        "I have never seen the General so despondent\n" +
        "I have taken over writing all his correspondence\n" +
        "Congress writes, \"George, attack the British forces.\"\n" +
        "I shoot back, we have resorted to eating our horses\n" +
        "Local merchants deny us equipment, assistance\n" +
        "They only take British money, so sing a song of sixpence\n" +
        "The cavalry's not coming\n" +
        "But, sir!\n" +
        "Alex, listen. There's only one way for us to win this\n" +
        "Provoke outrage, outright\n" +
        "That's right\n" +
        "Don't engage, strike by night\n" +
        "Remain relentless 'til their troops take flight\n" +
        "Make it impossible to justify the cost of the fight\n" +
        "Outrun\n" +
        "Outrun\n" +
        "Outlast\n" +
        "Outlast\n" +
        "Hit 'em quick, get out fast\n" +
        "Chick-a-plao!\n" +
        "Stay alive 'til this horror show is past\n" +
        "We're gonna fly a lot of flags half-mast\n" +
        "Raise a glass!\n" +
        "I go back to New York and my apprenticeship\n" +
        "I ask for French aid, I pray that France has sent a ship\n" +
        "I stay at work with Hamilton\n" +
        "We write essays against slavery\n" +
        "And every day's a test of our camaraderie and bravery\n" +
        "We cut supply lines, we steal contraband\n" +
        "We pick and choose our battles and places to take a stand\n" +
        "And ev'ry day\n" +
        "\"Sir, entrust me with a command\"\n" +
        "And ev'ry day\n" +
        "No\n" +
        "He dismisses me out of hand\n" +
        "Instead of me (Stay alive...)\n" +
        "He promotes\n" +
        "Charles Lee (Charles Lee)\n" +
        "Makes him second-in-command:\n" +
        "I'm a General. Whee!\n" +
        "Yeah. He's not the choice I would have gone with\n" +
        "He shits the bed at the Battle of Monmouth\n" +
        "Ev'ryone attack!\n" +
        "Retreat!\n" +
        "Attack!\n" +
        "Retreat!\n" +
        "What are you doing, Lee? Get back on your feet!\n" +
        "But there's so many of them!\n" +
        "I'm sorry, is this not your speed?!\n" +
        "Hamilton!\n" +
        "Ready, sir!\n" +
        "Have Lafayette take the lead!\n" +
        "Yes, sir!\n" +
        "A thousand soldiers die in a hundred degree heat\n" +
        "As we snatch a stalemate from the jaws of defeat\n" +
        "Charles Lee was left behind\n" +
        "Without a pot to piss in\n" +
        "He started sayin' this to anybody who would listen:\n" +
        "Washington cannot be left alone to his devices\n" +
        "Indecisive, from crisis to crisis\n" +
        "The best thing he can do for the revolution\n" +
        "Is turn n' go back to plantin' tobacco in Mount Vernon\n" +
        "Oo!\n" +
        "Don't do a thing. History will prove him wrong\n" +
        "But, sir!\n" +
        "We have a war to fight, let's move along\n" +
        "Strong words from Lee, someone oughta hold him to it\n" +
        "I can't disobey direct orders\n" +
        "Then I'll do it\n" +
        "Alexander, you're the closest friend I've got\n" +
        "Laurens, do not throw away your shot\n" +
                //The Ten Duel Commandments
        "One, two, three, four, five, six, seven, eight, nine\n" +
        "It's the Ten Duel Commandments\n" +
        "It's the Ten Duel Commandments\n" +
        "Number one\n" +
        "The challenge, demand satisfaction\n" +
        "If they apologize, no need for further action\n" +
        "Number two\n" +
        "If they don't, grab a friend, that's your second\n" +
        "Your lieutenant when there's reckoning to be reckoned\n" +
        "Number three\n" +
        "Have your seconds meet face to face\n" +
        "Negotiate a peace\n" +
        "Or negotiate a time and place\n" +
        "This is commonplace, 'specially 'tween recruits\n" +
        "Most disputes die, and no one shoots\n" +
        "Number four\n" +
        "If they don't reach a peace, that's alright\n" +
        "Time to get some pistols and a doctor on site\n" +
        "You pay him in advance, you treat him with civility\n" +
        "You have him turn around so he can have deniability\n" +
        "Five\n" +
        "Duel before the sun is in the sky\n" +
        "Pick a place to die where it's high and dry\n" +
        "Number six\n" +
        "Leave a note for your next of kin\n" +
        "Tell 'em where you been\n" +
        "Pray that hell or heaven lets you in\n" +
        "Seven\n" +
        "Confess your sins\n" +
        "Ready for the moment of adrenaline when you finally face your opponent\n" +
        "Number eight\n" +
        "Your last chance to negotiate\n" +
        "Send in your seconds, see if they can set the record straight\n" +
        "Alexander\n" +
        "Aaron Burr, sir\n" +
        "Can we agree that duels are dumb and immature?\n" +
        "Sure\n" +
        "But your man has to answer for his words, Burr\n" +
        "With his life? We both know that's absurd, sir\n" +
        "Hang on, how many men died because Lee was inexperienced and ruinous?\n" +
        "Okay, so we're doin' this\n" +
        "Number nine\n" +
        "Look 'em in the eye, aim no higher\n" +
        "Summon all the courage you require\n" +
        "Then count\n" +
        "One two three four\n" +
        "Five six seven eight nine\n" +
        "Number\n" +
        "Ten paces\n" +
        "Fire\n" +
                //Meet Me Inside
        "Lee, do you yield?\n" +
        "You shot him in the side\n" +
        "Yes, he yields\n" +
        "I'm satisfied\n" +
        "Yo, we gotta clear the field\n" +
        "Go\n" +
        "We won\n" +
        "Here comes the general\n" +
        "This should be fun\n" +
        "What is the meaning of this?\n" +
        "Mr. Burr, get a medic for the general\n" +
        "Yes, sir\n" +
        "Lee, you will never agree with me\n" +
        "But believe me, these young men don't speak for me\n" +
        "Thank you for your service\n" +
        "Let's ride\n" +
        "Hamilton\n" +
        "Sir\n" +
        "Meet me inside\n" +
        "Meet him inside\n" +
        "Meet him inside\n" +
        "Meet him inside, meet him, meet him inside\n" +
        "Son\n" +
        "Don't call me son\n" +
        "This war is hard enough\n" +
        "Without infighting\n" +
        "Lee called you out\n" +
        "We called his bluff\n" +
        "You solve nothing, you aggravate our allies to the south\n" +
        "You're absolutely right, John should have shot him in the mouth\n" +
        "That would've shut him up\n" +
        "Son\n" +
        "I'm notcha son\n" +
        "Watch your tone\n" +
        "I am not a maiden in need of defending, I am grown\n" +
        "Charles Lee, Thomas Conway\n" +
        "These men take your name and they rake it\n" +
        "Through the mud\n" +
        "My name's been through a lot, I can take it\n" +
        "Well, I don't have your name\n" +
        "I don't have your titles\n" +
        "I don't have your land\n" +
        "But, if you\n" +
        "No\n" +
        "If you gave me command of a battalion, a group of men to lead\n" +
        "I could fly above my station after the war\n" +
        "Or you could die and we need you alive\n" +
        "I'm more than willing to die\n" +
        "Your wife needs you alive, son, I need you alive\n" +
        "Call me son one more time\n" +
        "Go home, Alexander\n" +
        "That's an order from your commander\n" +
        "Sir\n" +
        "Go home\n" +
                //That Would Be Enough
        "Look around, look around at how lucky we are\n" +
        "To be alive right now\n" +
        "Look around, look around\n" +
        "How long have you known?\n" +
        "A month or so\n" +
        "Eliza, you should have told me\n" +
        "I wrote to the General a month ago\n" +
        "No\n" +
        "I begged him to send you home\n" +
        "You should have told me\n" +
        "I'm not sorry\n" +
        "You knew you'd fight\n" +
        "Until the war was won\n" +
        "The war's not done\n" +
        "But you deserve a chance to meet your son\n" +
        "Look around, look around at how lucky we are\n" +
        "To be alive right now\n" +
        "Will you relish being a poor man's wife\n" +
        "Unable to provide for your life?\n" +
        "I relish being your wife\n" +
        "Look around, look around\n" +
        "Look at where you are\n" +
        "Look at where you started\n" +
        "The fact that you're alive is a miracle\n" +
        "Just stay alive, that would be enough\n" +
        "And if this child\n" +
        "Shares a fraction of your smile\n" +
        "Or a fragment of your mind, look out world\n" +
        "That would be enough\n" +
        "I don't pretend to know\n" +
        "The challenges you're facing\n" +
        "The worlds you keep erasing and creating in your mind\n" +
        "But I'm not afraid\n" +
        "I know who I married\n" +
        "So long as you come home at the end of the day\n" +
        "That would be enough\n" +
        "We don't need a legacy\n" +
        "We don't need money\n" +
        "If I could grant you peace of mind\n" +
        "If you could let me inside your heart\n" +
        "Oh, let me be a part of the narrative\n" +
        "In the story they will write someday\n" +
        "Let this moment be the first chapter\n" +
        "Where you decide to stay\n" +
        "And I could be enough\n" +
        "And we could be enough\n" +
        "That would be enough\n" +
                //Guns and Ships
        "How does a ragtag volunteer army, in need of a shower\n" +
        "Somehow defeat a global superpower?\n" +
        "How do we emerge victorious from the quagmire?\n" +
        "Leave the battlefield waving Betsy Ross's flag higher?\n" +
        "Yo, turns out we have a secret weapon\n" +
        "An immigrant you know and love who's unafraid to step in\n" +
        "He's constantly confusing, confounding the British henchmen\n" +
        "Everyone give it up for America's favorite fighting Frenchman\n" +
        "Lafayette!\n" +
        "I'm taking this horse by the reins\n" +
        "Making redcoats redder with bloodstains\n" +
        "Lafayette!\n" +
        "And I'm never gonna stop until I make 'em drop\n" +
        "And burn 'em up and scatter the remains\n" +
        "I'm—Lafayette!\n" +
        "Watch me engaging 'em, escaping 'em, enraging 'em, ow\n" +
        "Lafayette!\n" +
        "I go to France for more funds\n" +
        "Lafayette!\n" +
        "I come back with more guns\n" +
        "And ships\n" +
        "And so the balance shifts\n" +
        "We rendezvous with Rochambeau\n" +
        "Consolidate their gifts\n" +
        "We can end this war at Yorktown, cut them off at sea, but\n" +
        "For this to succeed, there is someone else we need\n" +
        "I know (Hamilton!)\n" +
        "Sir, he knows what to do in the trench\n" +
        "Ingenuitive and fluent in French\n" +
        "I mean (Hamilton!)\n" +
        "Sir, you're going to have to use him eventually\n" +
        "What's he going to do on the bench\n" +
        "I mean (Hamilton!)\n" +
        "No one has more resilience\n" +
        "Or matches my practical, tactical brilliance (Hamilton!)\n" +
        "You want to fight for your land back? (Hamilton!)\n" +
        "I need my right hand man back (Hamilton!)\n" +
        "(Ah, uh, ) get your right hand man back (Hamilton!)\n" +
        "(You know you gotta get ya) right hand man back(Hamilton!)\n" +
        "I mean, you gotta put some thought into the letter (Ha- Ha-)\n" +
        "(Hamilton, Hamilton) But the sooner the better\n" +
        "To get your right hand man back (Ha- Ha-)\n" +
        "Alexander Hamilton\n" +
        "Troops are waiting in the field for you\n" +
        "If you join us right now, together we can turn the tide\n" +
        "Oh, Alexander Hamilton\n" +
        "I have soldiers that will yield for you\n" +
        "If we manage to get this right\n" +
        "They'll surrender by early light\n" +
        "The world will never be the same\n" +
        "Alexander\n" +
                //History Has Its Eyes On You
        "I was younger than you are now\n" +
        "When I was given my first command\n" +
        "I led my men straight into a massacre\n" +
        "I witnessed their deaths firsthand\n" +
        "I made every mistake\n" +
        "And felt the shame rise in me\n" +
        "And even now I lie awake\n" +
        "Knowing history has its eyes on me (whoa)\n" +
        "History has its eyes on me\n" +
        "Whoa\n" +
        "Whoa\n" +
        "Yeah\n" +
        "Let me tell you what I wish I'd known\n" +
        "When I was young and dreamed of glory\n" +
        "You have no control\n" +
        "Who lives, who dies, who tells your story\n" +
        "I know that we can win\n" +
        "I know that greatness lies in you\n" +
        "But remember from here on in\n" +
        "History has its eyes on you\n" +
        "Whoa\n" +
        "Whoa\n" +
        "History has its eyes on you\n" +
                //Yorktown
        "The battle of Yorktown, 1781\n" +
        "Monsieur Hamilton\n" +
        "Monsieur Lafayette\n" +
        "In command where you belong\n" +
        "How you say, no sweat\n" +
        "Finally on the field, we've had quite a run\n" +
        "Immigrants, we get the job done\n" +
        "So what happens if we win?\n" +
        "I go back to France\n" +
        "I bring freedom to my people\n" +
        "If I'm given the chance\n" +
        "We'll be with you when you do\n" +
        "Go lead your men\n" +
        "I see you on the other side\n" +
        "'Til we meet again, let's go!\n" +
        "I am not throwin' away my shot!\n" +
        "I am not throwin' away my shot!\n" +
        "Hey yo, I'm just like my country\n" +
        "I'm young scrappy and hungry\n" +
        "And I'm not throwin' away my shot!\n" +
        "I am not throwin' away my shot!\n" +
        "'Til the world turns upside down\n" +
        "'Til the world turns upside down!\n" +
        "I imagine death so much, it feels more like a memory\n" +
        "This is where it gets me, on my feet the enemy ahead of me\n" +
        "If this is the end of me, at least I have a friend with me\n" +
        "Weapon in my hand, a command, and my men with me\n" +
        "Then I remember my Eliza's expecting me\n" +
        "Not only that, my Eliza's expecting\n" +
        "We gotta go, gotta get the job done\n" +
        "Gotta start a new nation, gotta meet my son!\n" +
        "Take the bullets out your gun! (What?)\n" +
        "The bullets out your gun! (What?)\n" +
        "We move undercover and we move as one\n" +
        "Through the night, we have one shot to live\n" +
        "Another day\n" +
        "We cannot let a stray gunshot give us away\n" +
        "We will fight up close, seize the moment and stay in it\n" +
        "It's either that or meet the business end of a bayonet\n" +
        "The code word is \"Rochambeau\", dig me? (Rochambeau!)\n" +
        "You have your orders now, go, man, go!\n" +
        "And so the American experiment begins\n" +
        "With my friends all scattered to the winds\n" +
        "Laurens is in South Carolina, redefining bravery\n" +
        "We'll never be free until we end slavery!\n" +
        "When we finally drive the British away\n" +
        "Lafayette is there waiting in Chesapeake Bay!\n" +
        "How did we know that this plan would work?\n" +
        "We had a spy on the inside, that's right\n" +
        "Hercules Mulligan!\n" +
        "A tailor spyin' on the British government!\n" +
        "I take their measurements, information and then I smuggle it! (Up)\n" +
        "To my brother's revolutionary covenant\n" +
        "I'm runnin' with the Sons of Liberty and I am lovin' it!\n" +
        "See, that's what happens when you up against the ruffians\n" +
        "We in the shit now, somebody gotta shovel it!\n" +
        "Hercules Mulligan, I need no introduction\n" +
        "When you knock me down I get the f back up again!\n" +
        "Left! Right! Hold!\n" +
        "Go!\n" +
        "What! What! What!\n" +
        "After a week of fighting, a young man in a red coat stands on a parapet\n" +
        "We lower our guns as he frantically waves a white handkerchief\n" +
        "And just like that, it's over, we tend to our wounded, we count our dead\n" +
        "Black and white soldiers wonder alike if this really means freedom\n" +
        "Not yet\n" +
        "We negotiate the terms of surrender\n" +
        "I see George Washington smile\n" +
        "We escort their men out of Yorktown\n" +
        "They stagger home single file\n" +
        "Tens of thousands of people flood the streets\n" +
        "There are screams and church bells ringing\n" +
        "And as our fallen foes retreat\n" +
        "I hear the drinking song they're singing\n" +
        "The world turned upside down\n" +
        "The world turned upside down\n" +
        "The world turned upside down\n" +
        "The world turned upside down\n" +
        "Down, down, down, down\n" +
        "Freedom for America, freedom for France!\n" +
        "Down, down, down\n" +
        "Gotta start a new nation, gotta meet my son\n" +
        "Down, down, down\n" +
        "We won!\n" +
        "We won!\n" +
        "We won!\n" +
        "We won!\n" +
        "The world turned upside down!\n" +
                //What Comes Next
        "They say\n" +
        "The price of my war's not a price that they are willing to pay\n" +
        "Insane\n" +
        "You cheat with the French\n" +
        "Now I'm fighting with France and with Spain\n" +
        "I'm so blue\n" +
        "I thought that we made an arrangement when you went away\n" +
        "You were mine to subdue\n" +
        "When even despite our estrangement\n" +
        "I've got a small query for you\n" +
        "What comes next?\n" +
        "You've been freed\n" +
        "Do you know how hard it is to lead?\n" +
        "You're on your own\n" +
        "Awesome, wow!\n" +
        "Do you have a clue what happens now?\n" +
        "Oceans rise\n" +
        "Empires fall\n" +
        "It's much harder when it's all your call\n" +
        "All alone, across the sea\n" +
        "When your people say they hate you\n" +
        "Don't come crawling back to me\n" +
        "Da da da dat da dat da da da ya da\n" +
        "Da da dat da da ya da!\n" +
        "You're on your own\n" +
                //Dear Theodosia
        "Dear Theodosia, what to say to you?\n" +
        "You have my eyes\n" +
        "You have your mother's name\n" +
        "When you came into the world, you cried and it broke my heart\n" +
        "I'm dedicating every day to you\n" +
        "Domestic life was never quite my style\n" +
        "When you smile, you knock me out, I fall apart\n" +
        "And I thought I was so smart\n" +
        "You will come of age with our young nation\n" +
        "We'll bleed and fight for you, we'll make it right for you\n" +
        "If we lay a strong enough foundation\n" +
        "We'll pass it on to you, we'll give the world to you\n" +
        "And you'll blow us all away\n" +
        "Someday, someday\n" +
        "Yeah, you'll blow us all away\n" +
        "Someday, someday\n" +
        "Oh Philip, when you smile I am undone\n" +
        "My son\n" +
        "Look at my son\n" +
        "Pride is not the word I'm looking for\n" +
        "There is so much more inside me now\n" +
        "Oh Philip, you outshine the morning sun\n" +
        "My son\n" +
        "When you smile, I fall apart\n" +
        "And I thought I was so smart\n" +
        "My father wasn't around (my father wasn't around)\n" +
        "I swear that\n" +
        "I'll be around for you (I'll be around for you)\n" +
        "I'll do whatever it takes\n" +
        "I'll make a million mistakes\n" +
        "I'll make the world safe and sound for you\n" +
        "Will come of age with our young nation\n" +
        "We'll bleed and fight for you, we'll make it right for you\n" +
        "If we lay a strong enough foundation\n" +
        "We'll pass it on to you, we'll give the world to you\n" +
        "And you'll blow us all away\n" +
        "Someday, someday\n" +
        "Yeah, you'll blow us all away\n" +
        "Someday, someday\n" +
                //The Story of Tonight (Reprise 2)
        "I may not live to see our glory.\n" +
        "Alexander? There's a letter for you.\n" +
        "It's from John Laurens. I'll read it later.\n" +
        "But I will gladly join the fight.\n" +
        "No, it's from his father.\n" +
        "His father?\n" +
        "And when our children tell our story.\n" +
        "Will you read it?\n" +
        "They'll tell the story of tonight.\n" +
        "\"On Tuesday the 27th, my son was killed in a gunfight against British troops retreating from South Carolina. The war was already over. As you know, John dreamed of emancipating and recruiting 3000 men for the first all-black military regiment. His dream of freedom for these men dies with him.\"\n" +
        "Tomorrow there'll be more of us...\n" +
        "Alexander, are you alright?\n" +
        "I have so much work to do.\n" +
                //Non-Stop
        "After the war I went back to New York\n" +
        "A-After the war I went back to New York\n" +
        "I finished up my studies and I practiced law\n" +
        "I practiced law, Burr worked next door\n" +
        "Even though we started at the very same time\n" +
        "Alexander Hamilton began to climb\n" +
        "How to account for his rise to the top?\n" +
        "Man, the man is\n" +
        "Non-stop\n" +
        "Gentlemen of the jury, I'm curious, bear with me\n" +
        "Are you aware that we're making history?\n" +
        "This is the first murder trial of our brand-new nation\n" +
        "The liberty behind\n" +
        "Deliberation (non-stop)\n" +
        "I intend to prove beyond a shadow of a doubt\n" +
        "With my assistant counsel\n" +
        "Co-counsel\n" +
        "Hamilton, sit down\n" +
        "Our client Levi Weeks is innocent\n" +
        "Call your first witness\n" +
        "That's all you had to say\n" +
        "Okay\n" +
        "One more thing\n" +
        "Why do you assume you're the smartest in the room? (Hey)\n" +
        "Why do you assume you're the smartest in the room? (Hey)\n" +
        "Why do you assume you're the smartest in the room? (Hey)\n" +
        "Soon that attitude may be your doom (aww)\n" +
        "Why do you write like you're running out of time?\n" +
        "Write day and night like you're running out of time?\n" +
        "Everyday day you fight, like you're running out of time\n" +
        "Keep on fighting\n" +
        "In the meantime\n" +
        "Non-stop\n" +
        "Corruption's such an old song that we can sing along in harmony\n" +
        "And nowhere is it stronger than in Albany\n" +
        "This colony's economy's increasingly stalling and\n" +
        "Honestly, that's why public service (he's just non-stop)\n" +
        "Seems to be calling me\n" +
        "I practiced the law, I practically perfected it\n" +
        "I've seen injustice in the world and I've corrected it\n" +
        "Now for a strong central democracy\n" +
        "If not, then I'll be Socrates\n" +
        "Throwing verbal rocks\n" +
        "At these mediocrities (aww)\n" +
        "Hamilton, at the Constitutional Convention\n" +
        "I was chosen for the Constitutional Convention\n" +
        "There as a New York junior delegate\n" +
        "Now what I'm gonna say may sound indelicate (aww)\n" +
        "Goes and proposes his own form of government (what?)\n" +
        "His own plan for a new form of government (what?)\n" +
        "Talks for six hours\n" +
        "The convention is listless\n" +
        "Bright young man\n" +
        "Yo, who the f is this?\n" +
        "Why do you always say what you believe? (Hey)\n" +
        "Why do you always say what you believe? (Hey)\n" +
        "Every proclamation guarantees free ammunition for your enemies (aww)\n" +
        "Why do you write like it's going out of style?\n" +
        "Write day and night like it's going out of style?\n" +
        "Everyday you fight like it's going out of style\n" +
        "Do what you do\n" +
        "Alexander?\n" +
        "Aaron Burr, sir\n" +
        "Well, it's the middle of the night\n" +
        "Can we confer, sir?\n" +
        "Is this a legal matter?\n" +
        "Yes, and it's important to me\n" +
        "What do you need?\n" +
        "Burr, you're a better lawyer than me\n" +
        "Okay\n" +
        "I know I talk too much, I'm abrasive\n" +
        "You're incredible in court\n" +
        "You're succinct, persuasive\n" +
        "My client needs a strong defense\n" +
        "You're the solution\n" +
        "Who's your client?\n" +
        "The new U.S. Constitution?\n" +
        "No\n" +
        "Hear me out\n" +
        "No way\n" +
        "A series of essays, anonymously published\n" +
        "Defending the document to the public\n" +
        "No one will read it\n" +
        "I disagree\n" +
        "And if it fails?\n" +
        "Burr, that's why we need it\n" +
        "The constitution's a mess\n" +
        "So it needs amendments\n" +
        "It's full of contradictions\n" +
        "So is independence\n" +
        "We have to start somewhere\n" +
        "No\n" +
        "No way\n" +
        "You're making a mistake\n" +
        "Good night\n" +
        "Hey\n" +
        "What are you waiting for?\n" +
        "What do you stall for? (What?)\n" +
        "We won the war\n" +
        "What was it all for?\n" +
        "Do you support this constitution?\n" +
        "Of course\n" +
        "Then defend it\n" +
        "And what if you're backing the wrong horse?\n" +
        "Burr, we studied and we fought and we killed\n" +
        "For the notion of a nation we now get to build\n" +
        "For once in your life, take a stand with pride\n" +
        "I don't understand how you stand to the side\n" +
        "I'll keep all my plans\n" +
        "Close to my chest (wait for it, wait for it, wait)\n" +
        "I'll wait here and see\n" +
        "Which way the wind\n" +
        "Will blow\n" +
        "I'm taking my time\n" +
        "Watching the\n" +
        "Afterbirth of a nation\n" +
        "Watching the tension grow\n" +
        "I am sailing off to London\n" +
        "I am accompanied by someone\n" +
        "Who always pays\n" +
        "I have found a wealthy husband who will keep\n" +
        "Me in comfort for all my days\n" +
        "He is not a lot of fun, but there's no one who\n" +
        "Can match you for turn of phrase\n" +
        "My Alexander\n" +
        "Angelica\n" +
        "Don't forget to write\n" +
        "Look at where you are\n" +
        "Look at where you started\n" +
        "The fact that you're alive is a miracle\n" +
        "Just stay alive, that would be enough\n" +
        "And if your wife could share a fraction of your time\n" +
        "If I could grant you peace of mind\n" +
        "Would that be enough?\n" +
        "Alexander joins forces with James Madison and John Jay to write a series of essays\n" +
        "Defending the new United States Constitution\n" +
        "Entitled The Federalist Papers\n" +
        "The plan was to write a total of twenty-five essays\n" +
        "The work divided evenly among the three men\n" +
        "In the end, they wrote eighty-five essays, in the span of six months\n" +
        "John Jay got sick after writing five\n" +
        "James Madison wrote twenty-nine\n" +
        "Hamilton wrote the other fifty-one\n" +
        "How do you write like you're running out of time?\n" +
        "Write day and night like you're running out of time?\n" +
        "Everyday you fight like you're running out of time\n" +
        "Like you're running out of time\n" +
        "Are you running out of time?\n" +
        "How do you write like tomorrow won't arrive?\n" +
        "How do you write like you need it to survive?\n" +
        "How do you write every second you're alive?\n" +
        "Every second you're alive? Every second you're alive?\n" +
        "They are asking me to lead\n" +
        "I am doing the best I can\n" +
        "To get the people that I need\n" +
        "I'm asking you to be my right hand man\n" +
        "Treasury or State?\n" +
        "I know it's a lot to ask\n" +
        "Treasury or State?\n" +
        "To leave behind the world you know\n" +
        "Sir, do you want me to run the Treasury or State department?\n" +
        "Treasury\n" +
        "Let's go\n" +
        "Alexander\n" +
        "I have to leave\n" +
        "Alexander\n" +
        "Look around, look around at how lucky we are to be alive right now\n" +
        "Helpless\n" +
        "They are asking me to lead\n" +
        "Look around, isn't this enough?\n" +
        "He will never be satisfied\n" +
        "What would be enough?\n" +
        "He will never be satisfied (to be satisfied)\n" +
        "Satisfied\n" +
        "Satisfied (history has its eyes)\n" +
        "Why do you assume you're the smartest in the room?\n" +
        "Why do you assume you're the smartest in the room?\n" +
        "Why do you assume you're the smartest in the room?\n" +
        "Why do you write like it's going out of style?\n" +
        "Why do you fight like\n" +
        "History has its eyes on you\n" +
        "I am not throwin' away my shot\n" +
        "(Just you wait)\n" +
        "I am not throwin' away my shot\n" +
        "(Just you wait)\n" +
        "I am Alexander Hamilton, Hamilton\n" +
        "Just you wait\n" +
        "I am not throwin' away my shot\n";
                String act2 =
                //What Did I Miss
                "Seventeen. Se- se- seventeen...\n" +
                "Se- se- seventeen...\n" +
                "1789\n" +
                "How does the bastard orphan\n" +
                "Immigrant decorated war vet\n" +
                "Unite the colonies through more debt?\n" +
                "Fight the other founding fathers 'til he has to forfeit?\n" +
                "Have it all, lose it all\n" +
                "You ready for more yet?\n" +
                "Treasury Secretary. Washington's the President\n" +
                "Ev'ry American experiment sets a precedent\n" +
                "Not so fast. Someone came along to resist him\n" +
                "Pissed him off until we had a two-party system\n" +
                "You haven't met him yet, you haven't had the chance\n" +
                "'Cause he's been kickin' ass as the ambassador to France\n" +
                "But someone's gotta keep the American promise\n" +
                "You simply must meet Thomas. Thomas!\n" +
                "Thomas Jefferson's coming home!\n" +
                "Thomas Jefferson's coming home!\n" +
                "Thomas Jefferson's coming home!\n" +
                "Thomas Jefferson's coming home!\n" +
                "Thomas Jefferson's coming home\n" +
                "Lord, he's been off in Paris for so long!\n" +
                "Aaa-ooo!\n" +
                "Aaa-ooo!\n" +
                "France is following us to revolution\n" +
                "There is no more status quo\n" +
                "But the sun comes up and the world still spins\n" +
                "I helped Lafayette draft a declaration\n" +
                "Then I said, 'I gotta go\n" +
                "I gotta be in Monticello.'\n" +
                "Now the work at home begins\n" +
                "So what'd I miss?\n" +
                "What'd I miss?\n" +
                "Virginia, my home sweet home, I wanna give you a kiss\n" +
                "I've been in Paris meeting lots of different ladies\n" +
                "I guess I basic'lly missed the late eighties\n" +
                "I traveled the wide, wide world and came back to this\n" +
                "There's a letter on my desk from the President\n" +
                "Haven't even put my bags down yet\n" +
                "Sally be a lamb, darlin', won't cha open it?\n" +
                "It says the President's assembling a cabinet\n" +
                "And that I am to be the Secretary of State, great!\n" +
                "And that I'm already Senate-approved\n" +
                "I just got home and now I'm headed up to New York\n" +
                "Lookin' at the rolling fields\n" +
                "I can't believe that we are free\n" +
                "Ready to face\n" +
                "Whatever's awaiting\n" +
                "Me in N.Y.C.\n" +
                "But who's waitin' for me when I step in the place?\n" +
                "My friend James Madison, red in the face\n" +
                "He grabs my arm and I respond\n" +
                "\"What's goin' on?\" (Aaa-ooo!)\n" +
                "Thomas, we are engaged in a battle for our nation's very soul\n" +
                "Can you get us out of the mess we're in?\n" +
                "Hamilton's new financial plan is nothing less\n" +
                "Than government control\n" +
                "I've been fighting for the South alone\n" +
                "Where have you been?\n" +
                "Uh... France\n" +
                "We have to win\n" +
                "What'd I miss? (What, what, what'd I miss?)\n" +
                "What'd I miss? (I've come home to this)\n" +
                "Headfirst into a political abyss!\n" +
                "I have my first cabinet meeting today (chicka-pow!)\n" +
                "I guess I better think of something to say\n" +
                "I'm already on my way\n" +
                "Let's get to the bottom of this\n" +
                "Mr. Jefferson, welcome home\n" +
                "Mr. Jefferson? Alexander Hamilton\n" +
                "Mr. Jefferson, welcome home\n" +
                "Mr. Jefferson, welcome home\n" +
                "Sir, you've been off in Paris for so long!\n" +
                "So what did I miss?\n" +
                // Cabinet Battle 1
                "Ladies and gentlemen, you could have been anywhere in the world tonight\n" +
                "But you're here with us in New York City\n" +
                "Are you ready for a cabinet meeting, huh?\n" +
                "The issue on the table, Secretary Hamilton's plan to assume state debt and establish a national bank\n" +
                "Secretary Jefferson, you have the floor, sir\n" +
                "Life, liberty and the pursuit of happiness\n" +
                "We fought for these ideals, we shouldn't settle for less\n" +
                "These are wise words, enterprising men quote 'em\n" +
                "Don't act surprised, you guys, 'cause I wrote 'em (ow)\n" +
                "But Hamilton forgets\n" +
                "His plan would have the government assume state's debts\n" +
                "Now, place your bets as to who that benefits\n" +
                "The very seat of government where Hamilton sits\n" +
                "Oh, if the shoe fits, wear it\n" +
                "If New York's in debt, why should Virginia bear it?\n" +
                "Uh, our debts are paid, I'm afraid\n" +
                "Don't tax the South 'cause we got it made in the shade\n" +
                "In Virginia, we plant seeds in the ground\n" +
                "We create, you just wanna move our money around\n" +
                "This financial plan is an outrageous demand\n" +
                "And it's too many damn pages for any man to understand\n" +
                "Stand with me in the land of the free and pray to God we never see Hamilton's candidacy\n" +
                "Look, when Britain taxed our tea, we got frisky\n" +
                "Imagine what gon' happen when you try to tax our whisky\n" +
                "Thank you, Secretary Jefferson\n" +
                "Secretary Hamilton, your response\n" +
                "Thomas, that was a real nice declaration\n" +
                "Welcome to the present, we're running a real nation\n" +
                "Would you like to join us, or stay mellow\n" +
                "Doin' whatever the hell it is you do in Monticello?\n" +
                "If we assume the debts, the union gets new line of credit, a financial diuretic\n" +
                "How do you not get it, if we're aggressive and competitive\n" +
                "The union gets a boost, you'd rather give it a sedative?\n" +
                "A civics lesson from a slaver, hey neighbor\n" +
                "Your debts are paid 'cause you don't pay for labor\n" +
                "\"We plant seeds in the South. We create.\" Yeah, keep ranting\n" +
                "We know who's really doing the planting\n" +
                "And another thing, Mr. Age of Enlightenment\n" +
                "Don't lecture me about the war, you didn't fight in it\n" +
                "You think I'm frightened of you, man?\n" +
                "We almost died in a trench\n" +
                "While you were off getting high with the French\n" +
                "Thomas Jefferson, always hesitant with the President\n" +
                "Reticent there isn't a plan he doesn't jettison\n" +
                "Madison, you're mad as a hatter, son, take your medicine\n" +
                "Damn, you're in worse shape than the national debt is in\n" +
                "Sittin' there useless as two shits\n" +
                "Hey, turn around, bend over, I'll show you where my shoe fits\n" +
                "Excuse me, Madison, Jefferson, take a walk\n" +
                "Hamilton, take a walk, we're gonna reconvene after a brief recess, Hamilton\n" +
                "Sir\n" +
                "A word\n" +
                "You don't have the votes (you don't have the votes)\n" +
                "Aha-ha-ha ha\n" +
                "You're gonna need congressional approval and you don't have the votes\n" +
                "Such a blunder sometimes it makes me wonder why I even bring the thunder\n" +
                "Why he even brings the thunder\n" +
                "You wanna pull yourself together?\n" +
                "I'm sorry, these Virginians are birds of a feather\n" +
                "Young man, I'm from Virginia, so watch your mouth\n" +
                "So we let Congress get held hostage by the South?\n" +
                "You need the votes\n" +
                "No, we need bold strokes, we need this plan (no, you need to convince more folks)\n" +
                "James Madison won't talk to me, that's a nonstarter\n" +
                "Ah, winning was easy, young man, governing's harder\n" +
                "They're being intransigent\n" +
                "You have to find a compromise\n" +
                "But they don't have a plan, they just hate mine (convince them otherwise)\n" +
                "And what happens if I don't get congressional approval?\n" +
                "I imagine they'll call for your removal\n" +
                "Sir\n" +
                "Figure it out, Alexander, that's an order from your commander\n" +
                //Take A Break
                "Un-deux-trois-quatre-cinq-six-sept-huit-neuf (un-deux-trois-quatre-cinq-six-sept-huit-neuf )\n" +
                "Good, un deux trois quatre cinq six sept huit (un-deux-trois-quatre-cinq-six-sept-huit-neuf )\n" +
                "Sept-huit-neuf (sept-huit-neuf)\n" +
                "Sept-huit-neuf (sept-huit-neuf)\n" +
                "One-two-three-four-five-six-seven-eight-nine\n" +
                "My dearest, Angelica, tomorrow and tomorrow and tomorrow\n" +
                "Creeps in this petty pace from day to day\n" +
                "I trust you'll understand the reference to another Scottish tragedy without my having to name the play\n" +
                "They think me Macbeth, and ambition is my folly\n" +
                "I'm a polymath, a pain in the ass, a massive pain\n" +
                "Madison is Banquo, Jefferson's Macduff\n" +
                "And Birnam Wood is Congress on its way to Dunsinane\n" +
                "And there you are, an ocean away\n" +
                "Do you have to live an ocean away\n" +
                "Thoughts of you subside\n" +
                "Then I get another letter\n" +
                "I cannot put the notion away\n" +
                "Take a break\n" +
                "I am on my way\n" +
                "There's a little surprise before supper and it cannot wait\n" +
                "I'll be there in just a minute, save my plate\n" +
                "Alexander (okay, okay)\n" +
                "Your son is nine years old today\n" +
                "He has something he'd like to say\n" +
                "He's been practicing all day\n" +
                "Philip, take it away\n" +
                "Daddy, daddy, look\n" +
                "My name is Philip\n" +
                "I am a poet, I wrote this poem jus to show it\n" +
                "And I just turned nine\n" +
                "You can write rhymes but you can't write mine\n" +
                "I practice French and play piano with my mother\n" +
                "I have a sister, but I want a little brother (okay)\n" +
                "My daddy's trying to start America's bank\n" +
                "Un deux trois quatre cinq (bravo)\n" +
                "Take a break\n" +
                "Hey, our kid is pretty great\n" +
                "Run away with us for the summer, let's go upstate\n" +
                "Eliza, I've got so much on my plate\n" +
                "We can all go stay with my father\n" +
                "There's a lake I know (I know)\n" +
                "In a nearby park (I'd love to go)\n" +
                "You and I can go when the night gets dark\n" +
                "I will try to get away\n" +
                "My dearest Alexander\n" +
                "You must get through to Jefferson\n" +
                "Sit down with him and compromise\n" +
                "Don't stop 'til you agree\n" +
                "Your favourite older sister\n" +
                "Angelica, reminds you\n" +
                "There's someone in your corner all the way across the sea\n" +
                "In a letter I received from you two weeks ago\n" +
                "I noticed a comma in the middle of a phrase\n" +
                "It changed the meaning, did you intend this\n" +
                "One stroke and you've consumed my waking days, it says\n" +
                "My dearest Angelica\n" +
                "With a comma after dearest, you've written\n" +
                "My dearest, Angelica\n" +
                "Anyway, all this to say\n" +
                "I'm coming home this summer at my sister's invitation\n" +
                "I'll be there with your family if you make your way upstate\n" +
                "I know you're very busy I know your work's important\n" +
                "But I'm crossing the ocean and I just can't wait\n" +
                "You won't be an ocean away\n" +
                "You will only be a moment away\n" +
                "Alexander, come downstairs, Angelica's arriving today\n" +
                "Angelica\n" +
                "Eliza\n" +
                "The Schuyler sisters\n" +
                "Alexander\n" +
                "Hi\n" +
                "It's good to see your face\n" +
                "Angelica, tell this man John Adams spends the summer with his family\n" +
                "Angelica, tell my wife John Adams doesn't have a real job anyway\n" +
                "You're not joining us, wait\n" +
                "I'm afraid I cannot join you upstate\n" +
                "Alexander, I came all this way\n" +
                "She came all this way (all this way, take a break)\n" +
                "You know I have to get my plan through Congress\n" +
                "Run away with us for the summer let's go upstate\n" +
                "I lose my job if I don't get my plan through Congress\n" +
                "We can all go stay with our father\n" +
                "There's a lake I know (I know I'll miss you face)\n" +
                "(In a nearby park) (screw your courage to the sticking place)\n" +
                "You and I can go (Eliza's right)\n" +
                "Take a break and get away\n" +
                "Run away with us for the summer (let's go upstate)\n" +
                "Where we can stay (we can all go stay with our father)\n" +
                "If you take your time (look around, look around at how lucky we are to be alive right now)\n" +
                "You will make your mark\n" +
                "Close your eyes and dream\n" +
                "When the night gets dark\n" +
                "Take a break\n" +
                "I have to get my plan through Congress\n" +
                "I can't stop until I get this plan through Congress\n" +
                //Say No To This
                "There's nothing like summer in the city\n" +
                "Someone under stress meets someone looking pretty\n" +
                "There's trouble in the air, you can smell it\n" +
                "And Alexander's by himself, I'll let him tell it\n" +
                "I hadn't slept in a week\n" +
                "I was weak, I was awake\n" +
                "You've never seen a bastard orphan more in need of a break\n" +
                "Longing for Angelica\n" +
                "Missing my wife\n" +
                "That's when Miss Maria Reynolds walked into my life, she said\n" +
                "I know you are a man of honor\n" +
                "I'm so sorry to bother you at home\n" +
                "But I don't know where to go, and I came here all alone\n" +
                "She said\n" +
                "My husband's doin' me wrong\n" +
                "Beatin' me, cheatin' me, mistreatin' me\n" +
                "Suddenly he's up and gone\n" +
                "I don't have the means to go on\n" +
                "So I offered her a loan, I offered to walk her home, she said\n" +
                "You're too kind, sir\n" +
                "I gave her thirty bucks that I had socked away\n" +
                "She lived a block away, she said\n" +
                "This one's mine, sir\n" +
                "Then I said, \"Well, I should head back home\"\n" +
                "She turned red, she led me to her bed\n" +
                "Let her legs spread and said\n" +
                "Stay\n" +
                "Hey\n" +
                "Hey\n" +
                "That's when I began to pray\n" +
                "Lord, show me how to say no to this\n" +
                "I don't know how to say no to this\n" +
                "But my God, she looks so helpless\n" +
                "And her body's saying, \"Hell, yes\"\n" +
                "Whoa\n" +
                "No, show me how to say no to this\n" +
                "I don't know how to say no to this\n" +
                "In my mind, I'm tryin' to go (go, go, go)\n" +
                "Then her mouth is on mine, and I don't say\n" +
                "No, no (say no to this)\n" +
                "No, no (say no to this)\n" +
                "No, no (say no to this)\n" +
                "No, no (say no to this)\n" +
                "I wish I could say that was the last time\n" +
                "I said that last time, it became a pastime\n" +
                "A month into this endeavor I received a letter\n" +
                "From a Mr. James Reynolds, even better, it said\n" +
                "Dear Sir, I hope this letter finds you in good health\n" +
                "And in a prosperous enough position to put wealth\n" +
                "In the pockets of people like me down on their luck\n" +
                "You see, that was my wife who you decided to (fuuuu)\n" +
                "Uh oh, you made the wrong sucker a cuckold\n" +
                "So time to pay the piper for the pants you unbuckled\n" +
                "And hey, you can keep seein' my whore wife\n" +
                "If the price is right, if not I'm telling your wife\n" +
                "I hid the letter and I raced to her place\n" +
                "Screamed, \"How could you?\" In her face, she said\n" +
                "No, sir\n" +
                "Half dressed, apologetic, a mess, she looked pathetic, she cried\n" +
                "Please don't go, sir\n" +
                "So was your whole story a setup?\n" +
                "I don't know about any letter (stop crying God dammit, get up)\n" +
                "I didn't know any better (I am ruined)\n" +
                "Please don't leave me with him helpless (I am helpless how could I do this?)\n" +
                "Just give him what he wants and you can have me (I don't want you, I don't want you)\n" +
                "Whatever you want, if you pay\n" +
                "You can stay (Lord, show me how to say no to this)\n" +
                "I don't know how to say no to this\n" +
                "But this situation's helpless (helpless)\n" +
                "And her body's screaming, \"Hell, yes\"\n" +
                "No, show me how to say no to this (whoa)\n" +
                "How can I say no to this?\n" +
                "There is nowhere I can go (go, go, go)\n" +
                "When her body's on mine I do not say (no) yes\n" +
                "Say no to this\n" +
                "Say no to this, I don't say no to this\n" +
                "There is nowhere I can go (go, go, go)\n" +
                "So?\n" +
                "Nobody needs to know\n" +
                //The Room Where It Happens
                "Ah, Mister Secretary\n" +
                "Mister Burr, sir\n" +
                "Did'ya hear the news about good old General Mercer\n" +
                "No\n" +
                "You know Clermont Street\n" +
                "Yeah\n" +
                "They renamed it after him, the Mercer legacy is secure\n" +
                "Sure\n" +
                "And all he had to do was die\n" +
                "That's a lot less work\n" +
                "We oughta give it a try\n" +
                "Ha\n" +
                "Now how're you gonna get your debt plan through\n" +
                "I guess I'm gonna fin'ly have to listen to you\n" +
                "Really\n" +
                "Talk less, smile more\n" +
                "Ha\n" +
                "Do whatever it takes to get my plan on the Congress floor\n" +
                "Now, Madison and Jefferson are merciless\n" +
                "Well, hate the sin, love the sinner\n" +
                "Hamilton\n" +
                "I'm sorry Burr, I've gotta go\n" +
                "But\n" +
                "Decisions are happening over dinner\n" +
                "Two Virginians and an immigrant walk into a room\n" +
                "Diametric'ly opposed, foes\n" +
                "They emerge with a compromise, having opened doors that were\n" +
                "Previously closed\n" +
                "Bros\n" +
                "The immigrant emerges with unprecedented financial power\n" +
                "A system he can shape however he wants\n" +
                "The Virginians emerge with the nation's capital\n" +
                "And here's the pièce de résistance\n" +
                "No one else was in\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "No one else was in\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "No one really knows how the game is played\n" +
                "The art of the trade\n" +
                "How the sausage gets made\n" +
                "We just assume that it happens\n" +
                "But no one else is in\n" +
                "The room where it happens\n" +
                "Thomas claims\n" +
                "Alexander was on Washington's doorstep one day\n" +
                "In distress 'n' disarray\n" +
                "Thomas claims\n" +
                "Alexander said\n" +
                "I've nowhere else to turn\n" +
                "And basic'ly begged me to join the fray\n" +
                "Thomas claims\n" +
                "I approached Madison and said\n" +
                "I know you hate 'im, but let's hear what he has to say\n" +
                "Thomas claims\n" +
                "Well, I arranged the meeting\n" +
                "I arranged the menu, the venue, the seating\n" +
                "But\n" +
                "No one else was in\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "No one else was in\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "No one really knows how the\n" +
                "Parties get to yes\n" +
                "The pieces that are sacrificed in\n" +
                "Ev'ry game of chess\n" +
                "We just assume that it happens\n" +
                "But no one else is in\n" +
                "The room where it happens\n" +
                "Meanwhile\n" +
                "Madison is grappling with the fact that not ev'ry issue can be settled by committee\n" +
                "Meanwhile\n" +
                "Congress is fighting over where to put the capital\n" +
                "It isn't pretty\n" +
                "Then Jefferson approaches with a dinner and invite\n" +
                "And Madison responds with Virginian insight\n" +
                "Maybe we can solve one problem with another and win a victory for the Southerners, in other words\n" +
                "Oh ho\n" +
                "A quid pro quo\n" +
                "I suppose\n" +
                "Wouldn't you like to work a little closer to home\n" +
                "Actually, I would\n" +
                "Well, I propose the Potomac\n" +
                "And you'll provide him his votes\n" +
                "Well, we'll see how it goes\n" +
                "Let's go\n" +
                "No\n" +
                "One else was in\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "No one else was in\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "The room where it happened\n" +
                "My God\n" +
                "In God we trust\n" +
                "But we'll never really know what got discussed\n" +
                "Click-boom then it happened\n" +
                "And no one else was in the room where it happened\n" +
                "Alexander Hamilton\n" +
                "What did they say to you to get you to sell New York City down the river\n" +
                "Alexander Hamilton\n" +
                "Did Washington know about the dinner\n" +
                "Was there Presidential pressure to deliver\n" +
                "Alexander Hamilton\n" +
                "Or did you know, even then, it doesn't matter\n" +
                "Where you put the U.S. Capital\n" +
                "'Cause we'll have the banks\n" +
                "We're in the same spot\n" +
                "You got more than you gave\n" +
                "And I wanted what I got\n" +
                "When you got skin in the game, you stay in the game\n" +
                "But you don't get a win unless you play in the game\n" +
                "Oh, you get love for it, you get hate for it\n" +
                "You get nothing if you\n" +
                "Wait for it, wait for it, wait\n" +
                "God help and forgive me\n" +
                "I wanna build\n" +
                "Something that's gonna\n" +
                "Outlive me\n" +
                "What do you want, Burr\n" +
                "What do you want, Burr\n" +
                "If you stand for nothing\n" +
                "Burr, then what do you fall for\n" +
                "I\n" +
                "Wanna be in\n" +
                "The room where it happens\n" +
                "The room where it happens\n" +
                "I\n" +
                "Wanna be in\n" +
                "The room where it happens\n" +
                "The room where it happens\n" +
                "I\n" +
                "Wanna be\n" +
                "In the room where it happens\n" +
                "I\n" +
                "I wanna be in the room\n" +
                "Oh\n" +
                "Oh\n" +
                "I wanna be in\n" +
                "The room where it happens\n" +
                "The room where it happens\n" +
                "The room where it happens\n" +
                "I wanna be in the room\n" +
                "Where it happens\n" +
                "The room where it happens\n" +
                "The room where it happen\n" +
                "The art of the compromise\n" +
                "Hold your nose and close your eyes\n" +
                "We want our leaders to save the day\n" +
                "But we don't get a say in what they trade away\n" +
                "We dream of a brand new start\n" +
                "But we dream in the dark for the most part\n" +
                "Dark as a tomb where it happens\n" +
                "I've got to be in\n" +
                "The room (where it happens)\n" +
                "I've got to be (the room where it happens)\n" +
                "I've got to be (the room where it happens)\n" +
                "Oh, I've got to be in\n" +
                "The room where it happens\n" +
                "I've got to be, I've gotta be, I've gotta be\n" +
                "In the room\n" +
                "Click boom\n" +
                //Schuyler Defeated
                "Look\n" +
                "Grandpa's in the paper\n" +
                "War hero Philip Schuyler loses senate seat to young upstart Aaron Burr\n" +
                "Grandpa just lost his seat in the senate\n" +
                "Sometimes that's how it goes\n" +
                "Daddy's gonna find out any minute\n" +
                "I'm sure he already knows\n" +
                "Further down\n" +
                "Further down\n" +
                "Let's meet the newest senator from New York\n" +
                "New York\n" +
                "Our senator\n" +
                "Burr\n" +
                "Since when are you a Democratic Republican\n" +
                "Since being one put me on the up and up again\n" +
                "No one knows who you are or what you do\n" +
                "They don't need to know me\n" +
                "They don't like you\n" +
                "Excuse me\n" +
                "Oh, Wall Street thinks you're great\n" +
                "You'll always be adored by the things you create\n" +
                "But upstate\n" +
                "Wait\n" +
                "People think you're crooked\n" +
                "Schuyler's seat was up for grabs so I took it\n" +
                "I've always considered you a friend\n" +
                "I don't see why that has to end\n" +
                "You changed parties to run against my father in law\n" +
                "I changed parties to seize the opportunity I saw\n" +
                "I swear your pride will be the death of us all\n" +
                "Beware, it goeth before the fall\n" +
                // Cabinet Battle 2
                "The issue on the table, France is on the verge of war with England\n" +
                "And do we provide aid and troops to our French allies\n" +
                "Or do we stay out of it, remember\n" +
                "My decision on this matter is not subject to congressional approval\n" +
                "The only person you have to convince is me\n" +
                "Secretary Jefferson, you have the floor, sir\n" +
                "When we were on death's door, when we were needy\n" +
                "We made a promise, we signed a treaty\n" +
                "We needed money and guns and half a chance\n" +
                "Who provided those funds\n" +
                "France\n" +
                "In return, they didn't ask for land\n" +
                "Only a promise that we'd lend a hand\n" +
                "And stand with them if they fought against oppressors\n" +
                "And revolution is messy but now is the time to stand\n" +
                "Stand with our brothers as they fight against tyranny\n" +
                "I know that Alexander Hamilton is here and he\n" +
                "Would rather not have this debate\n" +
                "I'll remind you that he is not Secretary of State\n" +
                "He knows nothing of loyalty\n" +
                "Smells like new money, dresses like fake royalty\n" +
                "Desperate to rise above his station\n" +
                "Everything he does betrays the ideals of our nation\n" +
                "Ooh\n" +
                "Hey, and if ya don't know, now ya know, Mister President\n" +
                "Thank you, Secretary Jefferson\n" +
                "Secretary Hamilton, your response\n" +
                "You must be out of your Goddamn mind if you think\n" +
                "The President is gonna bring the nation to the brink\n" +
                "Of meddling in the middle of a military mess\n" +
                "A game of chess, where France is Queen and Kingless\n" +
                "We signed a treaty with a King whose head is now in a basket\n" +
                "Would you like to take it out and ask it\n" +
                "Should we honor our treaty, King Louis' head\n" +
                "Uh do whatever you want, I'm super dead\n" +
                "Enough, Hamilton is right\n" +
                "Mister President\n" +
                "We're too fragile to start another fight\n" +
                "But sir, do we not fight for freedom\n" +
                "Sure, when the French figure out who's gonna lead 'em\n" +
                "The people are leading\n" +
                "The people are rioting\n" +
                "There's a difference, frankly\n" +
                "It's a little disquieting you would let your ideals blind you to reality\n" +
                "Hamilton\n" +
                "Sir\n" +
                "Draft a statement of neutrality\n" +
                "Did you forget Lafayette\n" +
                "What\n" +
                "Have you an ounce of regret\n" +
                "You accumulate debt, you accumulate power\n" +
                "Yet in their hour of need, you forget\n" +
                "Lafayette's a smart man, he'll be fine\n" +
                "And before he was your friend, he was mine\n" +
                "If we try to fight in every revolution in the world, we never stop\n" +
                "Where do we draw the line\n" +
                "So quick witted\n" +
                "Alas, I admit it\n" +
                "I bet you were quite a lawyer\n" +
                "My defendants got acquitted\n" +
                "Yeah, well, someone oughta remind you\n" +
                "What\n" +
                "You're nothing without Washington behind you\n" +
                "Hamilton\n" +
                "Daddy's calling" +
                //Washington On Your Side
                "It must be nice, it must be nice\n" +
                "To have Washington on your side\n" +
                "It must be nice, it must be nice\n" +
                "To have Washington on your side\n" +
                "Every action has an equal opposite reaction\n" +
                "Thanks to Hamilton, our cabinet's fractured into factions\n" +
                "Try not to crack under the stress, we're breaking down like fractions\n" +
                "We smack each other in the press, and we don't print retractions\n" +
                "I get no satisfaction witnessing his fits of passion\n" +
                "The way he primps and preens and dresses like the pits of fashion\n" +
                "Our poorest citizens, our farmers, live ration to ration\n" +
                "As Wall Street robs 'em blind in search of chips to cash in\n" +
                "This prick is asking for someone to bring him to task\n" +
                "Somebody give me some dirt on his vacuous mask\n" +
                "So we can, at last, unmask him\n" +
                "I'll pull the trigger on him, someone load the gun and cock it\n" +
                "While we were all watching, he got Washington in his pocket\n" +
                "It must be nice, it must be nice\n" +
                "To have Washington on your side\n" +
                "It must be nice, it must be nice\n" +
                "To have Washington on your side\n" +
                "Look back at the Bill of Rights (Which I wrote!)\n" +
                "The ink hasn't dried\n" +
                "It must be nice, it must be nice\n" +
                "To have Washington on your side\n" +
                "So he's doubled the size of the government\n" +
                "Wasn't the trouble with much of our previous government size?\n" +
                "Look in his eyes\n" +
                "See how he lies\n" +
                "Follow the scent of his enterprise\n" +
                "Centralizing national credit and making American credit competitive\n" +
                "If we don't stop it, we aid and abet it\n" +
                "I have to resign\n" +
                "Somebody has to stand up for the South\n" +
                "Well, somebody has to stand up to his mouth\n" +
                "If there's a fire you're trying to douse\n" +
                "You can't put it out from inside the house\n" +
                "I'm in the cabinet, I am complicit\n" +
                "And watching and grabbing the power and kiss it\n" +
                "If Washington isn't gon' listen to disciplined dissidents\n" +
                "This is the difference, this kid is out\n" +
                "Oh! This immigrant isn't somebody we chose\n" +
                "Oh! This immigrant's keeping us all on our toes\n" +
                "Oh! Let's show these Federalists what they're up against\n" +
                "Oh! Southern motherf-ing Democratic-Republicans\n" +
                "Oh! Now follow the money and see where it goes\n" +
                "Oh! Because every second, the treasury grows\n" +
                "Oh! If we follow the money and see where it leads\n" +
                "Get in the weeds, look for the seeds of Hamilton's misdeeds\n" +
                "It must be nice, it must be nice\n" +
                "Follow the money and see where it goes\n" +
                "It must be nice, it must be nice\n" +
                "The emperor has no clothes\n" +
                "We won't be invisible\n" +
                "We won't be denied\n" +
                "Still, it must be nice, it must be nice\n" +
                "To have Washington on your side\n" +
                //One Last Time
                "Mr. President, you asked to see me?\n" +
                "I know you're busy\n" +
                "What do you need, sir? Sir?\n" +
                "I wanna give you a word of warning\n" +
                "Sir, I don't know what you heard\n" +
                "But whatever it is, Jefferson started it\n" +
                "Thomas Jefferson resigned this morning\n" +
                "You're kidding\n" +
                "I need a favor\n" +
                "Whatever you say, sir, Jefferson will pay for this behavior\n" +
                "Shh\n" +
                "Talk less\n" +
                "I'll use the press\n" +
                "I'll write under a pseudonym, you'll see what I can do to him\n" +
                "I need you to draft an address\n" +
                "Yes! He resigned\n" +
                "You can finally speak your mind\n" +
                "No, he's stepping down so he can run for President\n" +
                "Ha. Good luck defeating you, sir\n" +
                "I'm stepping down, I'm not running for President\n" +
                "I'm sorry, what?\n" +
                "One last time\n" +
                "Relax, have a drink with me\n" +
                "One last time\n" +
                "Let's take a break tonight\n" +
                "And then we'll teach them how to say goodbye\n" +
                "To say goodbye\n" +
                "You and I\n" +
                "No, sir, why?\n" +
                "I wanna talk about neutrality\n" +
                "Sir, with Britain and France on the verge of war, is this the best time\n" +
                "I want to warn against partisan fighting\n" +
                "But\n" +
                "Pick up a pen, start writing\n" +
                "I wanna talk about what I have learned\n" +
                "The hard-won wisdom I have earned\n" +
                "As far as the people are concerned\n" +
                "You have to serve, you could continue to serve\n" +
                "No! One last time\n" +
                "The people will hear from me\n" +
                "One last time\n" +
                "And if we get this right\n" +
                "We're gonna teach 'em how to say goodbye\n" +
                "You and I\n" +
                "Mr. President, they will say you're weak\n" +
                "No, they will see we're strong\n" +
                "Your position is so unique\n" +
                "So I'll use it to move them along\n" +
                "Why do you have to say goodbye?\n" +
                "If I say goodbye, the nation learns to move on\n" +
                "It outlives me when I'm gone\n" +
                "Like the scripture says:\n" +
                "\"Everyone shall sit under their own vine and fig tree\n" +
                "And no one shall make them afraid.\"\n" +
                "They'll be safe in the nation we've made\n" +
                "I wanna sit under my own vine and fig tree\n" +
                "A moment alone in the shade\n" +
                "At home in this nation we've made\n" +
                "One last time\n" +
                "One last time\n" +
                "Though, in reviewing the incidents of my administration, I am unconscious of intentional error, I am nevertheless too sensible of my defects not to think it probable that I may have committed many errors. I shall also carry with me\n" +
                "The hope (that my country will) view them with indulgence (and that)\n" +
                "After forty-five years of my life dedicated to its service with an upright zeal\n" +
                "(The faults of incompetent abilities will be) consigned to oblivion,\n" +
                "As I myself must soon be to the mansions of rest\n" +
                "I anticipate with pleasing expectation that retreat in which I promise myself to realize the sweet enjoyment of partaking,\n" +
                "In the midst of my fellow-citizens, the benign influence of good laws under a free government,\n" +
                "The ever-favorite object of my heart, and the happy reward, as I trust\n" +
                "Of our mutual cares, labors, and dangers\n" +
                "One last time\n" +
                "George Washington's going home!\n" +
                "Teach 'em how to say goodbye\n" +
                "George Washington's going home!\n" +
                "You and I\n" +
                "George Washington's going home!\n" +
                "Going home\n" +
                "George Washington's going home!\n" +
                "History has its eyes on you, you, you! Yeah!\n" +
                "George Washington's going home!\n" +
                "We're gonna teach 'em how to say goodbye!\n" +
                "(Teach 'em how to say goodbye!)\n" +
                "Teach 'em how to say goodbye!\n" +
                "(Teach 'em how!)\n" +
                "To say goodbye!\n" +
                "(Say goodbye!)\n" +
                "Say goodbye!\n" +
                "(Say goodbye!)\n" +
                "One last time!\n" +
                "(One last time!)\n" +
                "Time...\n" +
                //I Know Him
                "They say\n" +
                "George Washington's yielding his power and stepping away\n" +
                "Is that true?\n" +
                "I wasn't aware that was something a person could do\n" +
                "I'm perplexed\n" +
                "Are they going to keep on replacing whoever's in charge?\n" +
                "If so, who's next?\n" +
                "There's nobody else in their country who looms quite as large\n" +
                "John Adams?\n" +
                "I know him\n" +
                "That can't be\n" +
                "That's that little guy who spoke to me\n" +
                "All those years ago\n" +
                "What was it, eighty-five?\n" +
                "That poor man, they're gonna eat him alive!\n" +
                "Oceans rise\n" +
                "Empires fall\n" +
                "Next to Washington, they all look small\n" +
                "All alone\n" +
                "Watch them run\n" +
                "They will tear each other into pieces\n" +
                "Jesus Christ, this will be fun!\n" +
                "Da da da dat da dat da da da dai ya da\n" +
                "Da da da dat dat dai ya da, hahahahaha!\n" +
                "President John Adams\n" +
                "Good luck!\n" +
                //The Adams Administration
                "How does Hamilton, the short-tempered\n" +
                "Protean creator of the Coast Guard\n" +
                "Founder of the New York Post\n" +
                "Ardently abuse his cab'net post\n" +
                "Destroy his reputation?\n" +
                "Welcome, folks to\n" +
                "The Adams administration!\n" +
                "Jefferson's the runner-up\n" +
                "Which makes him the Vice President\n" +
                "Washington can't help you now\n" +
                "No more mister nice President\n" +
                "Adams fires Hamilton\n" +
                "Privately calls him \"creole bastard\" in his taunts\n" +
                "Say what.\n" +
                "Hamilton publishes his response:\n" +
                "Sit down, John, you FAT MOTHERF-\n" +
                "Hamilton is out of control\n" +
                "This is great! He's out of power. He holds no office.\n" +
                "And he just destroyed President John Adams\n" +
                "The only other significant member of his party.\n" +
                "Hamilton's a host unto himself.\n" +
                "As long as he can hold a pen, he's a threat.\n" +
                "Let's let him know what we know.\n" +
                //We Know
                "Mister Vice President\n" +
                "Mister Madison\n" +
                "Senator Burr\n" +
                "What is this?\n" +
                "We have the check stubs, from separate accounts\n" +
                "Almost a thousand dollars, paid in different amounts\n" +
                "To a Mister James Reynolds way back in\n" +
                "Seventeen ninety-one\n" +
                "Is that what you have, are you done?\n" +
                "You are uniquely situated by virtue of your position\n" +
                "Though virtue is not a word I'd apply to this situation\n" +
                "To seek financial gain, to stray from your sacred mission\n" +
                "And the evidence suggests you've engaged in speculation\n" +
                "An immigrant embezzling our government funds\n" +
                "I can almost see the headline, your career is done\n" +
                "I hope you saved some money for your daughter and sons\n" +
                "Ya best g'wan run back where ya come from\n" +
                "Ha you don't even know what you're asking me to confess\n" +
                "Confess\n" +
                "You have nothing, I don't have to tell you anything at all\n" +
                "Unless\n" +
                "Unless\n" +
                "If I can prove that I never broke the law\n" +
                "Do you promise not to tell another soul what you saw?\n" +
                "No one else was in the room where it happened\n" +
                "Is that a yes?\n" +
                "Um, yes\n" +
                "Dear Sir, I hope this letter finds you in good health\n" +
                "And in a prosperous enough position to put wealth\n" +
                "In the pockets of people like me, down on their luck\n" +
                "You see, that was my wife who you decided to\n" +
                "What\n" +
                "She courted me\n" +
                "Escorted me to bed and when she had me in a corner\n" +
                "That's when Reynolds extorted me\n" +
                "For a sordid fee\n" +
                "I paid him quarterly\n" +
                "I may have mortally wounded my prospects\n" +
                "But my papers are orderly\n" +
                "As you can see I kept a record of every check in my checkered history\n" +
                "Check it again against your list n' see consistency\n" +
                "I never spent a cent that wasn't mine\n" +
                "You sent the dogs after my scent, that's fine\n" +
                "Yes, I have reasons for shame\n" +
                "But I have not committed treason and sullied my good name\n" +
                "As you can see I have done nothing to provoke legal action\n" +
                "Are my answers to your satisfaction?\n" +
                "My God\n" +
                "Gentlemen, let's go\n" +
                "So?\n" +
                "The people won't know what we know\n" +
                "Burr\n" +
                "How do I know you won't use this against me\n" +
                "The next time we go toe to toe?\n" +
                "Alexander, rumors only grow\n" +
                "And we both know what we know\n" +
                //Hurricane
                "In the eye of a hurricane\n" +
                "There is quiet\n" +
                "For just a moment\n" +
                "A yellow sky\n" +
                "When I was seventeen a hurricane\n" +
                "Destroyed my town\n" +
                "I didn't drown\n" +
                "I couldn't seem to die\n" +
                "I wrote my way out\n" +
                "Wrote everything down far as I could see\n" +
                "I wrote my way out\n" +
                "I looked up and the town had its eyes on me\n" +
                "They passed a plate around\n" +
                "Total strangers\n" +
                "Moved to kindness by my story\n" +
                "Raised enough for me to book passage on a\n" +
                "Ship that was New York bound\n" +
                "I wrote my way out of hell\n" +
                "I wrote my way to revolution\n" +
                "I was louder than the crack in the bell\n" +
                "I wrote Eliza love letters until she fell\n" +
                "I wrote about The Constitution and defended it well\n" +
                "And in the face of ignorance and resistance\n" +
                "I wrote financial systems into existence\n" +
                "And when my prayers to God were met with indifference\n" +
                "I picked up a pen, I wrote my own deliverance\n" +
                "In the eye of a hurricane\n" +
                "There is quiet\n" +
                "For just a moment\n" +
                "A yellow sky\n" +
                "I was twelve when my mother died\n" +
                "She was holding me\n" +
                "We were sick and she was holding me\n" +
                "I couldn't seem to die\n" +
                "Wait for it, wait for it, wait for it (I'll write my way out)\n" +
                "Wait for it, wait for it, wait for it (write everything down, far as I can see)\n" +
                "Wait for it, wait for it, wait for it, wait (history has its eyes on you)\n" +
                "I'll write my way out\n" +
                "Overwhelm them with honesty\n" +
                "This is the eye of the hurricane, this is the only\n" +
                "Way I can protect my legacy\n" +
                "Wait for it, wait for it, wait for it, wait\n" +
                "The Reynolds Pamphlet\n" +
                //The Reynolds Pamphlet
                "The Reynolds Pamphlet\n" +
                "Have you read this?\n" +
                "Alexander Hamilton had a torrid affair\n" +
                "And he wrote it down right there\n" +
                "Highlights!\n" +
                "\"The charge against me is in connection\n" +
                "With one James Reynolds\n" +
                "For purposes of improper speculation\n" +
                "My real crime is an amorous connection with his wife\n" +
                "For a considerable time with his knowing consent\"\n" +
                "Damn!\n" +
                "\"I had frequent meetings with her\n" +
                "Most of them at my own house\"\n" +
                "At his own house!\n" +
                "At his own house\n" +
                "Damn!\n" +
                "\"Mrs. Hamilton, with our children, being absent\n" +
                "On a visit to her father\"\n" +
                "No\n" +
                "Boo!\n" +
                "Have you read this?\n" +
                "Well, he's never gon' be President now\n" +
                "Never gon' be President now\n" +
                "Never gon' be President now\n" +
                "Never gon' be President now\n" +
                "Never gon' be President now\n" +
                "That's one less thing to worry about\n" +
                "That's one less thing to worry about\n" +
                "I came as soon as I heard (What?)\n" +
                "Angelica-\n" +
                "All the way from London?!\n" +
                "Damn!\n" +
                "Angelica, thank God\n" +
                "Someone who understands what I'm\n" +
                "Struggling here to do\n" +
                "I'm not here for you (Ooh!)\n" +
                "I know my sister like I know my own mind\n" +
                "You will never find anyone as trusting or as kind\n" +
                "I love my sister more than anything in this life\n" +
                "I will choose her happiness over mine every time\n" +
                "Put what we had aside, I'm standing at her side\n" +
                "You could never be satisfied, God, I hope you're satisfied\n" +
                "Well, he's never gon' be President now\n" +
                "Never gon' be President now\n" +
                "Never gon' be President now\n" +
                "Never gon' be President now\n" +
                "Never gon' be President now\n" +
                "Never gon' be President now\n" +
                "That's one less thing to worry about\n" +
                "That's one less thing to worry about\n" +
                "Hey, at least he(I) was honest with our (He's never gon' be President now)\n" +
                "Money (He's never gon' be President now)\n" +
                "Never gon' be president now\n" +
                "Hey, at least he(I) was honest with our (He's never gon' be President now)\n" +
                "Money (That's one less thing to worry about)\n" +
                "That's one less thing to worry about\n" +
                "The Reynolds Pamphlet\n" +
                "Have you read this?\n" +
                "You ever see somebody ruin their own life?\n" +
                "His poor wife\n" +
                //Burn
                "I saved every letter you wrote to me\n" +
                "From the moment I read them\n" +
                "I knew you were mine\n" +
                "You said you were mine\n" +
                "I thought you were mine\n" +
                "Do you know what Angelica said,\n" +
                "When we saw your first letter arrive?\n" +
                "She said, be careful with that one, love\n" +
                "He will do what it takes to survive\n" +
                "You and your words flooded my senses\n" +
                "Your sentences left me defenseless\n" +
                "You built me palaces out of paragraphs\n" +
                "You built cathedrals\n" +
                "I'm re-reading the letters you wrote to me\n" +
                "I'm searching and scanning for answers in every line\n" +
                "For some kind of sign\n" +
                "And when you were mine\n" +
                "The world seemed to burn\n" +
                "Burn\n" +
                "You published the letters she wrote you\n" +
                "You told the whole world\n" +
                "How you brought this girl into our bed\n" +
                "In clearing your name\n" +
                "You have ruined our lives\n" +
                "Do you know what Angelica said\n" +
                "When she read what you'd done?\n" +
                "She said, you've married an Icarus\n" +
                "He has flown too close to the sun\n" +
                "You and your words obsessed with your legacy\n" +
                "Your sentences border on senseless\n" +
                "And you are paranoid in every paragraph\n" +
                "How they perceive you\n" +
                "You, you, you!\n" +
                "I'm erasing myself from the narrative\n" +
                "Let future historians wonder how Eliza\n" +
                "Reacted\n" +
                "When you broke her heart\n" +
                "You have torn it all apart\n" +
                "I'm watching it burn\n" +
                "Watching it burn\n" +
                "The world has no right to my heart\n" +
                "The world has no place in our bed\n" +
                "They don't get to know what I said\n" +
                "I'm burning the memories\n" +
                "Burning the letters that might have redeemed you\n" +
                "You forfeit all rights to my heart\n" +
                "You forfeit the place in our bed\n" +
                "You'll sleep in your office instead\n" +
                "With only the memories of when you were mine\n" +
                "I hope that you burn\n" +
                //Blow Us All Away
                "Meet the latest graduate of King's College\n" +
                "I prob'ly shouldn't brag, but, dag, I amaze and astonish\n" +
                "The scholars say I got the same virtuosity and brains as my pops\n" +
                "The ladies say my brain's not where the resemblance stops\n" +
                "I'm only nineteen but my mind is older\n" +
                "Gotta be my own man, like my father, but bolder\n" +
                "I shoulder his legacy with pride, I used to hear him say\n" +
                "That someday I would (blow us all away!)\n" +
                "Ladies, I'm lookin for a Mr. George Eacker\n" +
                "Made a speech last week, our Fourth of July speaker\n" +
                "He disparaged my father's legacy in front of a crowd\n" +
                "I can't have that, I'm making my father proud\n" +
                "I saw him just up Broadway a couple of blocks, he was goin' to see a play\n" +
                "Well, I'll go visit his box (god, you're a fox!)\n" +
                "And y'all look pretty good in ya' frocks\n" +
                "How 'bout when I get back, we all strip down to our socks? (ooh, okay!)\n" +
                "Blow us all away\n" +
                "George (shh!) George! (shh, I'm tryin' to watch the show!)\n" +
                "Ya shoulda watched your mouth before you talked about my father though\n" +
                "I didn't say anything that wasn't true\n" +
                "Your father's a scoundrel, and so, it seems, are you\n" +
                "It's like that?\n" +
                "Yeah, I don't fool around, I'm not your little schoolboy friends\n" +
                "Well, see you on the dueling ground\n" +
                "That is, unless you wanna step outside and go now\n" +
                "I know where to find you, piss off, I'm watchin' this show now\n" +
                "Pops, if you had only heard the shit he said about you\n" +
                "I doubt you would have let it slide and I was not about to (slow down!)\n" +
                "I came to ask you for advice, this is my very first duel\n" +
                "They don't exactly cover this subject in boarding school\n" +
                "Did your friends attempt to negotiate a peace?\n" +
                "He refused to apologize, we had to let the peace talks cease\n" +
                "Where is this happening?\n" +
                "Across the river, in Jersey\n" +
                "Everything is legal in New Jersey!\n" +
                "Alright, so this is what you're gonna do\n" +
                "Stand there like a man until Eacker is in front of you\n" +
                "When the time comes, fire your weapon in the air\n" +
                "This will put an end to the whole affair\n" +
                "But what if he decides to shoot? Then I'm a goner\n" +
                "No, he'll follow suit if he's truly a man of honor\n" +
                "To take someone's life, that is something you can't shake\n" +
                "Philip, your mother can't take another heartbreak\n" +
                "Father!\n" +
                "Promise me\n" +
                "You don't want this young man's blood on your conscience\n" +
                "Okay, I promise\n" +
                "Come back home when you're done\n" +
                "Take my guns, be smart, make me proud, son\n" +
                "My name is Philip\n" +
                "I am a poet\n" +
                "And I'm a little nervous, but I can't show it\n" +
                "I'm sorry, I'm a Hamilton with pride\n" +
                "You talk about my father, I cannot let it slide\n" +
                "Mister Eacker, how was the rest of your show?\n" +
                "I'd rather skip the pleasantries, let's go\n" +
                "Grab your pistol (confer with your men)\n" +
                "The duel will commence after we count to ten (count to ten!)\n" +
                "Look 'em in the eye, aim no higher\n" +
                "Summon all the courage you require\n" +
                "Then slowly and clearly aim your gun towards the sky\n" +
                //Stay Alive (Reprise)
                "Where's my son?\n" +
                "Mr. Hamilton, come in, they brought him in a half an hour ago\n" +
                "He lost a lot of blood on the way over (stay alive) is he alive?\n" +
                "Yes, but you have to understand\n" +
                "The bullet entered just above his hip and lodged in his right arm\n" +
                "Can I see him please?\n" +
                "I'm doing everything I can but the wound was already infected when he arrived\n" +
                "Philip\n" +
                "Pa!\n" +
                "I did exactly as you said, Pa\n" +
                "I held my head up high\n" +
                "I know, I know, shh (high)\n" +
                "I know, I know, shh\n" +
                "I know you did everything just right\n" +
                "Even before we got to ten (shh)\n" +
                "I was aiming for the sky (I know, I know, shh)\n" +
                "I was aiming for the sky (I know, I know, shh)\n" +
                "I know, save your strength and stay alive! (No)\n" +
                "Eliza!\n" +
                "Is he breathing? Is he going to survive this? (Stay alive)\n" +
                "Who did this, Alexander, did you know?\n" +
                "Mom, I'm so sorry for forgetting what you taught me\n" +
                "My son\n" +
                "We played piano (I taught you piano)\n" +
                "You would put your hands on mine\n" +
                "You changed the melody every time\n" +
                "I would always change the line\n" +
                "Shh, I know, I know\n" +
                "I would always change the line\n" +
                "I know, I know\n" +
                "Un-deux-trois-quatre-cinq-six-sept-huit-neuf (un-deux-trois-quatre-cinq-six-sept-huit-neuf)\n" +
                "Good\n" +
                "Un-deux-trois-quatre-cinq-six-sept-huit-neuf (un-deux-trois)\n" +
                "Sept-huit-neuf\n" +
                "Sept-huit\n" +
                //It’s Quiet Uptown
                "There are moments that the words don't reach\n" +
                "There is suffering too terrible to name\n" +
                "You hold your child as tight as you can\n" +
                "And push away the unimaginable\n" +
                "The moments when you're in so deep\n" +
                "It feels easier to just swim down\n" +
                "The Hamiltons move uptown\n" +
                "And learn to live with the unimaginable\n" +
                "I spend hours in the garden\n" +
                "I walk alone to the store\n" +
                "And it's quiet uptown\n" +
                "I never liked the quiet before\n" +
                "I take the children to church on Sunday\n" +
                "A sign of the cross at the door\n" +
                "And I pray\n" +
                "That never used to happen before\n" +
                "Philip, you would like it uptown, it's quiet uptown\n" +
                "You knock me out, I fall apart\n" +
                "Look at where we are\n" +
                "Look at where we started\n" +
                "I know I don't deserve you, Eliza\n" +
                "But hear me out\n" +
                "That would be enough\n" +
                "If I could spare his life\n" +
                "If I could trade his life for mine\n" +
                "He'd be standing here right now\n" +
                "And you would smile, and that would be enough\n" +
                "I don't pretend to know\n" +
                "The challenges we're facing\n" +
                "I know there's no replacing what we've lost\n" +
                "And you need time\n" +
                "But I'm not afraid\n" +
                "I know who I married\n" +
                "Just let me stay here by your side\n" +
                "That would be enough\n" +
                "If you see him in the street, walking by her side\n" +
                "Talking by her side, have pity\n" +
                "Eliza, do you like it uptown? It's quiet uptown\n" +
                "Look around, look around, Eliza\n" +
                "(They are trying to do the unimaginable)\n" +
                "There are moments that the words don't reach\n" +
                "There is a grace too powerful to name\n" +
                "We push away what we can never understand\n" +
                "We push away the unimaginable\n" +
                "They are standing in the garden\n" +
                "Alexander by Eliza's side\n" +
                "She takes his hand\n" +
                "It's quiet uptown\n" +
                "Forgiveness. Can you imagine?\n" +
                "Forgiveness. Can you imagine?\n" +
                "If you see him in the street, walking by her\n" +
                "Side, talking by her side, have pity\n" +
                "They are going through the unimaginable\n" +
                //Election of 1800
                "The election of eighteen-hundred\n" +
                "Can we get back to politics?\n" +
                "yo\n" +
                "Every action has its equal, opposite reaction\n" +
                "John Adams shat the bed, I love the guy, but he's in traction\n" +
                "Poor Alexander Hamilton, he is missing in action\n" +
                "So now I'm facing (Aaron Burr) with his own faction\n" +
                "He's very attractive in the North, New Yorkers like his chances\n" +
                "He's not very forthcoming on any particular stances\n" +
                "Ask him a question, it glances off, he obfuscates, he dances\n" +
                "And they say I'm a Francophile, at least they know I know where France is\n" +
                "Thomas that's the problem, see, they see Burr as a less extreme you (ha)\n" +
                "You need to change course, a key endorsement might redeem you\n" +
                "Who did you have in mind?\n" +
                "Don't laugh\n" +
                "Who is it?\n" +
                "You used to work on the same staff\n" +
                "(What?) it might be nice, it might be nice\n" +
                "To get Hamilton on your side\n" +
                "It might be nice, it might be nice\n" +
                "To get Hamilton on your side\n" +
                "Talk less (Burr!)\n" +
                "Smile more (Burr!)\n" +
                "Don't let 'em know what you're against or what you're for (Burr!)\n" +
                "Shake hands with him (Burr!)\n" +
                "Charm her (Burr!)\n" +
                "It's eighteen hundred, ladies, tell your husbands vote for (Burr!)\n" +
                "I don't like Adams\n" +
                "Well, he's gonna lose, that's just defeatist\n" +
                "And Jefferson\n" +
                "In love with France\n" +
                "Yeah, he's so elitist\n" +
                "I like that Aaron Burr\n" +
                "I can't believe we're here with him\n" +
                "He seems approachable?\n" +
                "Like you could grab a beer with him\n" +
                "Dear Mr. Hamilton\n" +
                "Your fellow Fed'ralists would like to know how you'll be voting\n" +
                "(It's quiet uptown) dear Mr. Hamilton\n" +
                "John Adams doesn't stand a chance, so who are you promoting?\n" +
                "(It's quiet uptown) Jefferson or Burr, Jefferson or Burr? we know it's lose-lose\n" +
                "Jefferson or Burr? but if you had to choose\n" +
                "Dear Mr. Hamilton\n" +
                "John Adams doesn't stand a chance, so who are you promoting?\n" +
                "But if you had to choose\n" +
                "Well, if it isn't Aaron Burr, sir?\n" +
                "Alexander\n" +
                "You've created quite a stir, sir\n" +
                "I'm going door to door\n" +
                "You're openly campaigning?\n" +
                "Sure\n" +
                "That's new\n" +
                "Honestly, it's kind of draining\n" +
                "Burr\n" +
                "Sir!\n" +
                "Is there anything you wouldn't do?\n" +
                "No I'm chasing what I want, and you know what?\n" +
                "What?\n" +
                "I learned that from you\n" +
                "If you had to choose\n" +
                "If you had to choose\n" +
                "It's a tie\n" +
                "If you had to choose\n" +
                "If you had to choose\n" +
                "It's up to the delegates\n" +
                "If you had to choose\n" +
                "If you had to choose\n" +
                "It's up to Hamilton\n" +
                "If you had to choose\n" +
                "If you had to choose (Jefferson or Burr?)\n" +
                "If you had to choose, choose (Jefferson or Burr?)\n" +
                "Yo (oh!)\n" +
                "The people are asking to hear my voice (oh!)\n" +
                "For the country is facing a difficult choice (oh!)\n" +
                "And if you were to ask me who I'd promote (oh!)\n" +
                "Jefferson has my vote (oh!)\n" +
                "I have never agreed with Jefferson once (oh!)\n" +
                "We have fought on like seventy-five different fronts (oh!)\n" +
                "But when all is said and all is done\n" +
                "Jefferson has beliefs, Burr has none (ooh!)\n" +
                "Well, I'll be damned\n" +
                "Well, I'll be damned\n" +
                "Hamilton's on your side\n" +
                "Well, I'll be damned\n" +
                "Well, I'll be damned\n" +
                "And?\n" +
                "You won in a landslide!\n" +
                "Congrats on a race well-run\n" +
                "I did give you a fight\n" +
                "Uh-huh?\n" +
                "I look forward to our partnership\n" +
                "Our partnership?\n" +
                "As your vice-President\n" +
                "Ha-ha-ha-ha, yeah, right\n" +
                "You hear this guy?\n" +
                "Man openly campaigns against me, talkin' bout \"I look forward to our partnership\"\n" +
                "It is crazy that the guy who comes in second gets to be vice-President\n" +
                "Ooh, you know what, we can change that, you know why? (why?) 'cause I'm the President!\n" +
                "Burr, when you see Hamilton, thank him for the endorsement\n" +
                //Your Obedient Servant
                "How does Hamilton, an arrogant immigrant, orphan\n" +
                "Bastard, whoreson\n" +
                "Somehow endorse Thomas Jefferson, his enemy\n" +
                "A man he's despised since the beginning\n" +
                "Just to keep me from winning?\n" +
                "I wanna be in the room where it happens\n" +
                "The room where it happens\n" +
                "The room where it happens\n" +
                "You've kept me from the room where it happens\n" +
                "For the last time\n" +
                "Dear Alexander\n" +
                "I am slow to anger\n" +
                "But I toe the line\n" +
                "As I reckon with the effects\n" +
                "Of your life on mine\n" +
                "I look back on where I failed\n" +
                "And in every place I checked\n" +
                "The only common thread has been your disrespect\n" +
                "Now you call me \"amoral\"\n" +
                "A \"dangerous disgrace\"\n" +
                "If you've got something to say, name a time and place, face-to-face\n" +
                "I have the honor to be your obedient servant\n" +
                "A dot Burr\n" +
                "Mr. Vice President\n" +
                "I am not the reason no one trusts you\n" +
                "No one knows what you believe\n" +
                "I will not equivocate on my opinion\n" +
                "I have always worn it on my sleeve\n" +
                "Even if I said what you think I said\n" +
                "You would need to cite a more specific grievance\n" +
                "Here's an itemized list of thirty years of disagreements\n" +
                "Sweet Jesus\n" +
                "Hey, I have not been shy\n" +
                "I am just a guy in the public eye\n" +
                "Tryna do my best for our republic, I don't wanna fight\n" +
                "But I won't apologize for doing what's right\n" +
                "I have the honor to be your obedient servant\n" +
                "A dot Ham\n" +
                "Careful how you proceed, good man\n" +
                "Intemperate indeed, good man\n" +
                "Answer for the accusations I lay at your feet or prepare to bleed, good man\n" +
                "Burr, your grievance is legitimate\n" +
                "I stand by what I said, every bit of it\n" +
                "You stand only for yourself, it's what you do\n" +
                "I can't apologize because it's true\n" +
                "Then stand, Alexander\n" +
                "Weehawken, dawn\n" +
                "Guns drawn\n" +
                "You're on\n" +
                "I have the honor to be your obedient servant\n" +
                "A dot Ham\n" +
                "A dot Burr\n" +
                //Best of Wives and Best of Women
                "Alexander, come back to sleep\n" +
                "I have an early meeting out of town\n" +
                "It's still dark outside\n" +
                "I know, I just need to write something down\n" +
                "Why do you write like you're running out of time? (shh)\n" +
                "Come back to bed, that would be enough\n" +
                "I'll be back before you know I'm gone\n" +
                "Come back to sleep\n" +
                "This meeting's at dawn\n" +
                "Well, I'm going back to sleep\n" +
                "Hey\n" +
                "Best of wives and best of women\n" +
                //The World Was Wide Enough
                "One-two-three-four-five-six-seven-eight-nine\n" +
                "There are ten things you need to know (number one!)\n" +
                "We rowed across the Hudson at dawn\n" +
                "My friend, William P. Van Ness signed on as my (number two!)\n" +
                "Hamilton arrived with his crew\n" +
                "Nathaniel Pendleton and a doctor that he knew (number three!)\n" +
                "I watched Hamilton examine the terrain\n" +
                "I wish I could tell you what was happening in his brain\n" +
                "This man has poisoned my political pursuits!\n" +
                "Most disputes die and no one shoots (number four!)\n" +
                "Hamilton drew first position\n" +
                "Looking, to the world, like a man on a mission\n" +
                "This is a soldier with a marksman's ability\n" +
                "The doctor turned around so he could have deniability (five!)\n" +
                "Now I didn't know this at the time\n" +
                "But we were near the same spot my (your) son died, is that why? (six!)\n" +
                "He examined his gun with such rigor?\n" +
                "I watched as he methodically fiddled with the trigger\n" +
                "Confession time? here's what I got\n" +
                "My fellow soldiers'll tell you I'm a terrible shot (number eight!)\n" +
                "Your last chance to negotiate\n" +
                "Send in your seconds, see if they can set the record straight\n" +
                "They won't teach you this in your classes\n" +
                "But look it up, Hamilton was wearing his glasses\n" +
                "Why? If not to take deadly aim?\n" +
                "It's him or me, the world will never be the same\n" +
                "I had only one thought before the slaughter\n" +
                "This man will not make an orphan of my daughter (number nine!)\n" +
                "Look him in the eye, aim no higher\n" +
                "Summon all the courage you require\n" +
                "Then count (one-two-three-four-five-six-seven-eight-nine, number-ten paces, fire!)\n" +
                "I imagine death so much it feels more like a memory\n" +
                "Is this where it gets me, on my feet, sev'ral feet ahead of me?\n" +
                "I see it coming, do I run or fire my gun or let it be?\n" +
                "There is no beat, no melody\n" +
                "Burr, my first friend, my enemy\n" +
                "Maybe the last face I ever see\n" +
                "If I throw away my shot, is this how you'll remember me?\n" +
                "What if this bullet is my legacy?\n" +
                "Legacy, what is a legacy?\n" +
                "It's planting seeds in a garden you never get to see\n" +
                "I wrote some notes at the beginning of a song someone will sing for me\n" +
                "America, you great unfinished symphony, you sent for me\n" +
                "You let me make a difference, a place where even orphan immigrants\n" +
                "Can leave their fingerprints and rise up\n" +
                "I'm running out of time, I'm running, and my time's up\n" +
                "Wise up, eyes up\n" +
                "I catch a glimpse of the other side\n" +
                "Laurens leads a soldiers' chorus on the other side\n" +
                "My son is on the other side\n" +
                "He's with my mother on the other side\n" +
                "Washington is watching from the other side\n" +
                "Teach me how to say goodbye\n" +
                "Rise up, rise up, rise up, Eliza!\n" +
                "My love, take your time\n" +
                "I'll see you on the other side\n" +
                "Raise a glass to freedom\n" +
                "Wait!\n" +
                "I strike him right between his ribs\n" +
                "I walk towards him, but I am ushered away\n" +
                "They row him back across the Hudson\n" +
                "I get a drink\n" +
                "I hear wailing in the streets (aah, aah, aah)\n" +
                "Somebody tells me, \"You'd better hide\" (aah, aah, aah)\n" +
                "They say Angelica and Eliza\n" +
                "Were both at his side when he died\n" +
                "Death doesn't discriminate\n" +
                "Between the sinners and the saints, it takes and it takes and it takes\n" +
                "History obliterates, in every picture it paints\n" +
                "It paints me and all my mistakes\n" +
                "When Alexander aimed at the sky\n" +
                "He may have been the first one to die\n" +
                "But I'm the one who paid for it\n" +
                "I survived, but I paid for it\n" +
                "Now I'm the villain in your history\n" +
                "I was too young and blind to see\n" +
                "I should've known\n" +
                "I should've known the world was wide enough for both Hamilton and me\n" +
                "The world was wide enough for both Hamilton and me\n" +
                //Who Lives, Who Dies, Who Tells Your Story
                "Let me tell you what I wish I'd known\n" +
                "When I was young and dreamed of glory\n" +
                "You have no control\n" +
                "Who lives, who dies, who tells your story?\n" +
                "President Jefferson\n" +
                "I'll give him this, his financial system is a work of genius\n" +
                "I couldn't undo it if I tried\n" +
                "And I've tried\n" +
                "Who lives, who dies, who tells your story?\n" +
                "President Madison\n" +
                "He took our country from bankruptcy to prosperity\n" +
                "I hate to admit it\n" +
                "But he doesn't get enough credit for all the credit he gave us\n" +
                "Who lives, who dies, who tells your story\n" +
                "Every other founding fathers' story gets told\n" +
                "Every other founding father gets to grow old\n" +
                "And when you're gone, who remembers your name?\n" +
                "Who keeps your flame?\n" +
                "Who tells your story?\n" +
                "Who tells your story?\n" +
                "Who tells your story?\n" +
                "I put myself back in the narrative\n" +
                "(Eliza)\n" +
                "I stop wasting time on tears\n" +
                "I live another 50 years\n" +
                "It's not enough (Eliza)\n" +
                "I interview every soldier who fought by your side\n" +
                "(She tells our story)\n" +
                "I try to make sense of your thousands of pages of writings\n" +
                "You really do write like you're running out of time\n" +
                "I rely on Angelica\n" +
                "While she's alive, we tell your story\n" +
                "She is buried in Trinity Church near you\n" +
                "When I needed her most, she was right on time\n" +
                "And I'm still not through\n" +
                "I ask myself, what would you do if you had more time\n" +
                "The Lord, in his kindness\n" +
                "He gives me what you always wanted\n" +
                "He gives me more time\n" +
                "I raise funds in D.C. for the Washington Monument\n" +
                "(She tells my story)\n" +
                "I speak out against slavery\n" +
                "You could have done so much more if you only had time\n" +
                "And when my time is up, have I done enough?\n" +
                "Will they tell your story?\n" +
                "Oh, can I show you what I'm proudest of?\n" +
                "(The orphanage)\n" +
                "I established the first private orphanage in New York City\n" +
                "(The orphanage)\n" +
                "I help to raise hundreds of children\n" +
                "I get to see them growing up\n" +
                "(The orphanage)\n" +
                "In their eyes I see you, Alexander\n" +
                "I see you every time\n" +
                "And when my time is up\n" +
                "Have I done enough?\n" +
                "Will they tell your story?\n" +
                "Oh, I can't wait to see you again\n" +
                "It's only a matter of time\n" +
                "Will they tell your story? (Time)\n" +
                "Who lives, who dies, who tells your story? (Time)\n" +
                "Will they tell your story? (Time)\n" +
                "Who lives, who dies, who tells your story?\n";

                String ham = act1.toLowerCase();
        ham = ham.replace(',' , ' '); //removes special characters
        ham = ham.replace('.' , ' ');
        ham = ham.replace('?' , ' ');
        ham = ham.replace('!' , ' ');
        ham = ham.replace('"' , ' ');
        ham = ham.replace('(' , ' ');
        ham = ham.replace(')' , ' ');
        ham = ham.replace('-' , ' ');
        ham = ham.replace(':' , ' ');
        ham = ham.replace("\n", " ");

        String ilton = act2.toLowerCase();
        ilton = ilton.replace(',' , ' '); //removes special characters
        ilton = ilton.replace('.' , ' ');
        ilton = ilton.replace('?' , ' ');
        ilton = ilton.replace('!' , ' ');
        ilton = ilton.replace('"' , ' ');
        ilton = ilton.replace('(' , ' ');
        ilton = ilton.replace(')' , ' ');
        ilton = ilton.replace('-' , ' ');
        ilton = ilton.replace(':' , ' ');
        ilton = ilton.replace("\n", " ");

        String hami = ham + ilton;

        String[] hamilton = hami.split(" ");
        Arrays.sort(hamilton);
        int death = hamilton.length;
        int word_count = -1;
        int max = 0;
        //System.out.println(Arrays.toString(hamilton));
        for (int b = 0; b < death; b++){
            int washington = 0;
            int count = 0;
            for(int d = 0; d < b; d++){
                if(hamilton[b].equals(hamilton[d])){
                    count++;
                }
            }
            if(count == 0){
                word_count++;
                System.out.print(hamilton[b] +": ");
                for (int j = 0; j < death; j++) {
                    if (hamilton[b].equals(hamilton[j])) {
                        washington++;
                    }
                }
                System.out.println(washington);
                max = maxi(max, washington);
            }
        }

        System.out.println();
        System.out.println("There are " + word_count + " unique words in the text.");
       // System.out.println("The max is " + max);
        System.out.println("The length of Hamilton is " + death + " words long");

    }
}



