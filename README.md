# TwitchCon2017

  This project is Facial Recognition Overlay for the Twitch streaming service. We use an API to track the face of the streamer on the screen and register the emotion of the streamer. Based on the emotion we detect, a different animation will pop up. The main feature of this is called a salt meter. As a player's "anger" emotion increases, a meter will appear on the screen and track the amount of "saltiness" of the player. 
  We accomplished this with java and html by parsing data from a java program into a javascript capable html link, which we then used as a constantly refreshing overlay for twitch streaming accounts. This program is a twitch extention.The java coding was used to capture screenshots of the live stream and sending these images to a server where we implemented a Microsoft API which analyzes the emotions displayed on a face. We then have the results in terms of a score out of 100. When an emotion reaches the value 100, an emote appears in the top left hand corner. For happiness, a cheering panda will appear. For surprise, a PogChamp emote; for sadness a BibleThump and for disgust a DansGame facial emote. The fear emotion will bring a monkaS to the screen, and while we also get results for amount of contempt and neutral shown, we did not set a photo for those emotions.
  The main feature of our extension comes in the anger emotion. There is a PJSalt emote and meter that appears when the emotion reaches a value of 60, and when the meter hits 100, a flurry of salt falls from the top of the screen. The front end of the overlay was coded using HTML, Javascript and JQUery. We used the OBS platform for Twitch streaming to create an overlay that will update with the HTML webspace we created. Thus, streamers will be able to have live emote reactions to their emotions directly in their live stream. 
