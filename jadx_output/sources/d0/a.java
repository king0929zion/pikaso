package D0;

import B0.c;
import C0.e;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import d2.AbstractC0242m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f937a = new a();

    public final Object a(c cVar) {
        ArrayList arrayList = new ArrayList(AbstractC0242m.W(cVar));
        Iterator it = cVar.f276d.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0.b) it.next()).f274a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(e eVar, c cVar) {
        ArrayList arrayList = new ArrayList(AbstractC0242m.W(cVar));
        Iterator it = cVar.f276d.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0.b) it.next()).f274a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        eVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
