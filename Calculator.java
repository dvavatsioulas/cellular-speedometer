//DEVELOPER: DIMITRIOS VAVATSIOULAS


public class Calculator {

    double d0;					// αρχική απόσταση απο τον σταθμό βάσης
    double d1;					// επιπλέον απόσταση που διανύθηκε μετά απο n second
    double pdbm; 				// Αρχική ισχύς απο τον κόμβο βάσης σε dBm
    double pdbm_after_nsec; 	// Τελική ισχύς μετά απο n second σε dBm
    double p0_mwatt;			// Αρχική ισχύς απο τον κόμβο βάσης σε mwatt
    double p1_mwatt; 			// Τελική ισχύς απο τον κόμβο βάσης σε mwatt
    double u_m_sec;			// Ταχύτητα σε m/sec
    double u_km_h;				// Ταχύτητα σε Km/hour
    double diff_time; 			// χρόνος κινήσεως
    String message = new String();



    protected void calc(){
    	p0_mwatt=change_to_mw(pdbm); 
    	p1_mwatt=change_to_mw(pdbm_after_nsec);
        d1 = calc_d1(d0,p0_mwatt,p1_mwatt);
        u_m_sec = calc_u_msec(d1,diff_time);
        u_km_h = calc_u_kmhour(u_m_sec);
    }


    protected void setVariables(double d0, double pdbm, double pdbm_after_nsec, double diff_time) {
    	this.d0=d0;
    	this.pdbm=pdbm;
    	this.pdbm_after_nsec=pdbm_after_nsec;
    	this.diff_time=diff_time;
    }
    

    
    //συνάρτηση μετατροπής από dBm σε mwatt
    protected double change_to_mw(double pdbm){
        return (Math.pow(10, pdbm/10));
        
    }

    // Υπολογισμός απόστασης d1 με χρήση της αρχικής & της τελικής λαμβανόμενης ισχύς του παραλήπτη καθώς και της αρχικής απόστασης d0
    protected double calc_d1(double init_d0,double  pwr01_mwatt,double pwr02_mwatt){

    	return init_d0 * (Math.pow((pwr01_mwatt/pwr02_mwatt),0.25) - 1);
    }

    // Υπολογισμός ταχύτητας σε μέτρα ανα δευτερόλεπτο m/sec
    protected double calc_u_msec(double dist,double time){
        double u = dist/time;
        return u;
    }

    // Υπολογισμός ταχύτητας σε χιλιομετρα ανά ώρα Km/h
    protected double calc_u_kmhour(double u_msec){
        return (u_msec*3600/1000);
    }


	public double getD1() {
		return d1;
	}


	public double getU_km_h() {
		return u_km_h;
	}

    
    
}
