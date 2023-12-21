package Class.JavaExam12_19_02.JavaExam12_20_01;

class MyTv {
    private boolean isPowerOn;
    private int isVol;
    private int channel;

    final int MAX_VOL = 100;
    final int MIN_VOL = 0;
    final int MAX_CHA = 100;
    final int MIN_CHA = 0; //필드정리


    public void setVol(int vol) {
        if (vol > MAX_VOL || vol < MIN_VOL) { //|| => or
            return;
        } else {
            this.isVol = vol;
        }
    }

    /*void 리턴 없음
     * 대신 쓸 수 있는놈
     * int String ... */
    public int getVol() {
        return isVol;
    }

    public void setCha(int cha) {
        if (cha > MAX_CHA || cha < MIN_CHA) {   //|| => or
            return;
        } else {
            this.channel = cha;
        }
    }

    public int getCha() {
        return channel;
    }
}

public class YouTv {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        t.setCha(10);
        System.out.println(t.getCha());
        t.setVol(50);
        System.out.println(t.getVol());
    }
}
