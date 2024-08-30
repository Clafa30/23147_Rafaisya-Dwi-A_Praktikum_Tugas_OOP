package Tugas1;

public class Nilai {
	int NIM;
	double NilaiAbsen;
	double NilaiTugas;
	double NilaiUTS;
	double NilaiUAS;
	double NilaiAkhir;
	
		public void setNIM(int NIM) {
			this.NIM = NIM;
		}
		
		public void setNilaiAbsen(double NilaiAbsen) {
			this.NilaiAbsen = NilaiAbsen;
		}
		
		public void setNilaiTugas(double NilaiTugas) {
			this.NilaiTugas = NilaiTugas;
		}
		
		public void setNilaiUTS(double NilaiUTS) {
			this.NilaiUTS = NilaiUTS;
		}
		
		 public void setNilaiUAS(double NilaiUAS) {
	        this.NilaiUAS = NilaiUAS;
	    }
	 
	 	public double getNilaiAbsen() {
			return NilaiAbsen * 0.10;
		}

	    public double getNilaiTugas() {
	        return NilaiTugas * 0.20;
	    }

	    public double getNilaiUTS() {
	        return NilaiUTS * 0.30;
	    }

	    public double getNilaiUAS() {
	        return NilaiUAS * 0.40;
	    }
	    
	    public double getNilaiAkhir() {
	    	return getNilaiAbsen() + getNilaiTugas() + getNilaiUTS() + getNilaiUAS();
	    }
		
}
