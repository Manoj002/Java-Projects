package com.rajeshpatkar;

public class Bill {

    private Friend[] f = new Friend[90];
    private Agent[] a = new Agent[8];
    private Partner[] p = new Partner[2];

    public Bill() {
        for (int i = 0; i < f.length; i++) {
            f[i] = new Friend();
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = new Agent();
        }

        for (int i = 0; i < p.length; i++) {
            p[i] = new Partner();
        }
    }

    public void interactWithFriends() {
        for (Friend f : f) {
            f.singASong();
        }
    }

    public void interactWithAgents() {
        for (Agent f : a) {
            f.singASong();
        }
    }

    public void interactWithPartners() {
        for (Partner f : p) {
            f.singASong();
        }
    }

    public void setFriends(Friend[] f) {
        int index = 0;
        for (int i = 0; i < this.f.length; i++, index++) {
            f[index] = this.f[i];
        }
        for (int i = 0; i < this.a.length; i++, index++) {
            f[index] = this.a[i];
        }
        for (int i = 0; i < this.p.length; i++, index++) {
            f[index] = this.p[i];
        }
    }

    /*public void setAgents(Agent[] a) {
        int index = 0;
        for (int i = 0; i < this.a.length; i++, index++) {
            a[index] = this.a[i];
        }
        for (int i = 0; i < this.p.length; i++, index++) {
            a[index] = this.p[i];
        }
    }

    public void setPartners(Partner[] p) {
        for (int i = 0; i < this.p.length; i++) {
            p[i] = this.p[i];
        }
    }
*/
}
