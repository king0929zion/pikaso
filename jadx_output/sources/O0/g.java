package O0;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f1958a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1959b;

    /* renamed from: c, reason: collision with root package name */
    public final i f1960c;

    /* renamed from: d, reason: collision with root package name */
    public final h f1961d;

    /* renamed from: e, reason: collision with root package name */
    public final k f1962e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f1963f;

    public g() {
        j jVar = new j();
        jVar.f2029a = 0;
        jVar.f2030b = 0;
        jVar.f2031c = 1.0f;
        jVar.f2032d = Float.NaN;
        this.f1959b = jVar;
        i iVar = new i();
        iVar.f2025a = -1;
        iVar.f2026b = -1;
        iVar.f2027c = Float.NaN;
        iVar.f2028d = Float.NaN;
        this.f1960c = iVar;
        h hVar = new h();
        hVar.f1991a = false;
        hVar.f1997d = -1;
        hVar.f1999e = -1;
        hVar.f2001f = -1.0f;
        hVar.f2003g = -1;
        hVar.h = -1;
        hVar.f2006i = -1;
        hVar.f2007j = -1;
        hVar.f2008k = -1;
        hVar.f2009l = -1;
        hVar.f2010m = -1;
        hVar.f2011n = -1;
        hVar.f2012o = -1;
        hVar.f2013p = -1;
        hVar.f2014q = -1;
        hVar.f2015r = -1;
        hVar.f2016s = -1;
        hVar.f2017t = 0.5f;
        hVar.f2018u = 0.5f;
        hVar.f2019v = null;
        hVar.f2020w = -1;
        hVar.f2021x = 0;
        hVar.f2022y = 0.0f;
        hVar.f2023z = -1;
        hVar.f1965A = -1;
        hVar.f1966B = -1;
        hVar.f1967C = -1;
        hVar.f1968D = -1;
        hVar.f1969E = -1;
        hVar.f1970F = -1;
        hVar.f1971G = -1;
        hVar.f1972H = -1;
        hVar.f1973I = -1;
        hVar.f1974J = -1;
        hVar.f1975K = -1;
        hVar.f1976L = -1;
        hVar.f1977M = -1;
        hVar.f1978N = -1;
        hVar.f1979O = -1.0f;
        hVar.f1980P = -1.0f;
        hVar.f1981Q = 0;
        hVar.f1982R = 0;
        hVar.f1983S = 0;
        hVar.f1984T = 0;
        hVar.f1985U = -1;
        hVar.f1986V = -1;
        hVar.f1987W = -1;
        hVar.f1988X = -1;
        hVar.f1989Y = 1.0f;
        hVar.f1990Z = 1.0f;
        hVar.f1992a0 = -1;
        hVar.f1994b0 = 0;
        hVar.f1996c0 = -1;
        hVar.f2004g0 = false;
        hVar.f2005h0 = false;
        hVar.i0 = true;
        this.f1961d = hVar;
        k kVar = new k();
        kVar.f2034a = 0.0f;
        kVar.f2035b = 0.0f;
        kVar.f2036c = 0.0f;
        kVar.f2037d = 1.0f;
        kVar.f2038e = 1.0f;
        kVar.f2039f = Float.NaN;
        kVar.f2040g = Float.NaN;
        kVar.h = 0.0f;
        kVar.f2041i = 0.0f;
        kVar.f2042j = 0.0f;
        kVar.f2043k = false;
        kVar.f2044l = 0.0f;
        this.f1962e = kVar;
        this.f1963f = new HashMap();
    }

    public final void a(d dVar) {
        h hVar = this.f1961d;
        dVar.f1918d = hVar.f2003g;
        dVar.f1920e = hVar.h;
        dVar.f1922f = hVar.f2006i;
        dVar.f1924g = hVar.f2007j;
        dVar.h = hVar.f2008k;
        dVar.f1927i = hVar.f2009l;
        dVar.f1928j = hVar.f2010m;
        dVar.f1930k = hVar.f2011n;
        dVar.f1931l = hVar.f2012o;
        dVar.f1935p = hVar.f2013p;
        dVar.f1936q = hVar.f2014q;
        dVar.f1937r = hVar.f2015r;
        dVar.f1938s = hVar.f2016s;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = hVar.f1967C;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = hVar.f1968D;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = hVar.f1969E;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = hVar.f1970F;
        dVar.f1943x = hVar.f1978N;
        dVar.f1944y = hVar.f1977M;
        dVar.f1940u = hVar.f1974J;
        dVar.f1942w = hVar.f1976L;
        dVar.f1945z = hVar.f2017t;
        dVar.f1886A = hVar.f2018u;
        dVar.f1932m = hVar.f2020w;
        dVar.f1933n = hVar.f2021x;
        dVar.f1934o = hVar.f2022y;
        dVar.f1887B = hVar.f2019v;
        dVar.f1901P = hVar.f2023z;
        dVar.f1902Q = hVar.f1965A;
        dVar.f1890E = hVar.f1979O;
        dVar.f1889D = hVar.f1980P;
        dVar.f1892G = hVar.f1982R;
        dVar.f1891F = hVar.f1981Q;
        dVar.f1904S = hVar.f2004g0;
        dVar.f1905T = hVar.f2005h0;
        dVar.f1893H = hVar.f1983S;
        dVar.f1894I = hVar.f1984T;
        dVar.f1897L = hVar.f1985U;
        dVar.f1898M = hVar.f1986V;
        dVar.f1895J = hVar.f1987W;
        dVar.f1896K = hVar.f1988X;
        dVar.f1899N = hVar.f1989Y;
        dVar.f1900O = hVar.f1990Z;
        dVar.f1903R = hVar.f1966B;
        dVar.f1916c = hVar.f2001f;
        dVar.f1912a = hVar.f1997d;
        dVar.f1914b = hVar.f1999e;
        ((ViewGroup.MarginLayoutParams) dVar).width = hVar.f1993b;
        ((ViewGroup.MarginLayoutParams) dVar).height = hVar.f1995c;
        String str = hVar.f2002f0;
        if (str != null) {
            dVar.f1906U = str;
        }
        dVar.setMarginStart(hVar.f1972H);
        dVar.setMarginEnd(hVar.f1971G);
        dVar.a();
    }

    public final Object clone() {
        g gVar = new g();
        h hVar = gVar.f1961d;
        hVar.getClass();
        h hVar2 = this.f1961d;
        hVar.f1991a = hVar2.f1991a;
        hVar.f1993b = hVar2.f1993b;
        hVar.f1995c = hVar2.f1995c;
        hVar.f1997d = hVar2.f1997d;
        hVar.f1999e = hVar2.f1999e;
        hVar.f2001f = hVar2.f2001f;
        hVar.f2003g = hVar2.f2003g;
        hVar.h = hVar2.h;
        hVar.f2006i = hVar2.f2006i;
        hVar.f2007j = hVar2.f2007j;
        hVar.f2008k = hVar2.f2008k;
        hVar.f2009l = hVar2.f2009l;
        hVar.f2010m = hVar2.f2010m;
        hVar.f2011n = hVar2.f2011n;
        hVar.f2012o = hVar2.f2012o;
        hVar.f2013p = hVar2.f2013p;
        hVar.f2014q = hVar2.f2014q;
        hVar.f2015r = hVar2.f2015r;
        hVar.f2016s = hVar2.f2016s;
        hVar.f2017t = hVar2.f2017t;
        hVar.f2018u = hVar2.f2018u;
        hVar.f2019v = hVar2.f2019v;
        hVar.f2020w = hVar2.f2020w;
        hVar.f2021x = hVar2.f2021x;
        hVar.f2022y = hVar2.f2022y;
        hVar.f2023z = hVar2.f2023z;
        hVar.f1965A = hVar2.f1965A;
        hVar.f1966B = hVar2.f1966B;
        hVar.f1967C = hVar2.f1967C;
        hVar.f1968D = hVar2.f1968D;
        hVar.f1969E = hVar2.f1969E;
        hVar.f1970F = hVar2.f1970F;
        hVar.f1971G = hVar2.f1971G;
        hVar.f1972H = hVar2.f1972H;
        hVar.f1973I = hVar2.f1973I;
        hVar.f1974J = hVar2.f1974J;
        hVar.f1975K = hVar2.f1975K;
        hVar.f1976L = hVar2.f1976L;
        hVar.f1977M = hVar2.f1977M;
        hVar.f1978N = hVar2.f1978N;
        hVar.f1979O = hVar2.f1979O;
        hVar.f1980P = hVar2.f1980P;
        hVar.f1981Q = hVar2.f1981Q;
        hVar.f1982R = hVar2.f1982R;
        hVar.f1983S = hVar2.f1983S;
        hVar.f1984T = hVar2.f1984T;
        hVar.f1985U = hVar2.f1985U;
        hVar.f1986V = hVar2.f1986V;
        hVar.f1987W = hVar2.f1987W;
        hVar.f1988X = hVar2.f1988X;
        hVar.f1989Y = hVar2.f1989Y;
        hVar.f1990Z = hVar2.f1990Z;
        hVar.f1992a0 = hVar2.f1992a0;
        hVar.f1994b0 = hVar2.f1994b0;
        hVar.f1996c0 = hVar2.f1996c0;
        hVar.f2002f0 = hVar2.f2002f0;
        int[] iArr = hVar2.f1998d0;
        if (iArr != null) {
            hVar.f1998d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            hVar.f1998d0 = null;
        }
        hVar.f2000e0 = hVar2.f2000e0;
        hVar.f2004g0 = hVar2.f2004g0;
        hVar.f2005h0 = hVar2.f2005h0;
        hVar.i0 = hVar2.i0;
        i iVar = gVar.f1960c;
        iVar.getClass();
        i iVar2 = this.f1960c;
        iVar2.getClass();
        iVar.f2025a = iVar2.f2025a;
        iVar.f2026b = iVar2.f2026b;
        iVar.f2028d = iVar2.f2028d;
        iVar.f2027c = iVar2.f2027c;
        j jVar = gVar.f1959b;
        j jVar2 = this.f1959b;
        jVar.f2029a = jVar2.f2029a;
        jVar.f2031c = jVar2.f2031c;
        jVar.f2032d = jVar2.f2032d;
        jVar.f2030b = jVar2.f2030b;
        k kVar = gVar.f1962e;
        kVar.getClass();
        k kVar2 = this.f1962e;
        kVar2.getClass();
        kVar.f2034a = kVar2.f2034a;
        kVar.f2035b = kVar2.f2035b;
        kVar.f2036c = kVar2.f2036c;
        kVar.f2037d = kVar2.f2037d;
        kVar.f2038e = kVar2.f2038e;
        kVar.f2039f = kVar2.f2039f;
        kVar.f2040g = kVar2.f2040g;
        kVar.h = kVar2.h;
        kVar.f2041i = kVar2.f2041i;
        kVar.f2042j = kVar2.f2042j;
        kVar.f2043k = kVar2.f2043k;
        kVar.f2044l = kVar2.f2044l;
        gVar.f1958a = this.f1958a;
        return gVar;
    }
}
