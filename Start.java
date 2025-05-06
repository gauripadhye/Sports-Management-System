public class Start
{
    public static void main(String str[])
	{
		Whole w = new Whole();
		w.first=new First(w);
		w.login=new Login(w);
		w.about=new About(w);
		w.ground=new Ground(w);
		w.gallery=new Gallery(w);
		w.signup=new Signup(w);
		w.home=new Home(w);
		w.coachinfo=new Coachinfo(w);
		w.playerinfo=new Playerinfo(w);
		w.staffinfo=new Staffinfo(w);
		w.settings=new Settings(w);
		w.notice=new Notice(w);
		w.search=new Search(w);
		w.playingxi=new PlayingXi(w);
		w.statics=new Statics(w);
		w.admin=new Admin(w);
		w.aplayingxi=new AplayingXI(w);
		w.unotice=new Unotice(w);
		w.aplayer=new Aplayer(w);
		w.aground=new Aground(w);
		w.add=new Add(w);
		w.acoach=new Acoach(w);
		w.astaff=new Astaff(w);
		w.delete=new Delete(w);
		w.first.setVisible(true);

		/*try
		{
			w.bufferplayer.loadplayer();
			w.buffercoach.loadcoach();
			w.bufferstaff.loadstaff();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		w.bufferplayer.test();
		w.buffercoach.test();
		w.bufferstaff.test();*/
	}
}	