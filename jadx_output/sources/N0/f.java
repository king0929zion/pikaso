package N0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final m f1820d;

    /* renamed from: f, reason: collision with root package name */
    public int f1822f;

    /* renamed from: g, reason: collision with root package name */
    public int f1823g;

    /* renamed from: a, reason: collision with root package name */
    public m f1817a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1818b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1819c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1821e = 1;
    public int h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f1824i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1825j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1826k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1827l = new ArrayList();

    public f(m mVar) {
        this.f1820d = mVar;
    }

    @Override // N0.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f1827l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f1825j) {
                return;
            }
        }
        this.f1819c = true;
        m mVar = this.f1817a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f1818b) {
            this.f1820d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i3 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i3++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i3 == 1 && fVar.f1825j) {
            g gVar = this.f1824i;
            if (gVar != null) {
                if (!gVar.f1825j) {
                    return;
                } else {
                    this.f1822f = this.h * gVar.f1823g;
                }
            }
            d(fVar.f1823g + this.f1822f);
        }
        m mVar2 = this.f1817a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(m mVar) {
        this.f1826k.add(mVar);
        if (this.f1825j) {
            mVar.a(mVar);
        }
    }

    public final void c() {
        this.f1827l.clear();
        this.f1826k.clear();
        this.f1825j = false;
        this.f1823g = 0;
        this.f1819c = false;
        this.f1818b = false;
    }

    public void d(int i3) {
        if (this.f1825j) {
            return;
        }
        this.f1825j = true;
        this.f1823g = i3;
        Iterator it = this.f1826k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1820d.f1835b.f1572W);
        sb.append(":");
        switch (this.f1821e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f1825j ? Integer.valueOf(this.f1823g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1827l.size());
        sb.append(":d=");
        sb.append(this.f1826k.size());
        sb.append(">");
        return sb.toString();
    }
}
