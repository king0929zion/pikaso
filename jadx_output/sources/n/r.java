package N;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Collection f1769f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i3, Collection collection) {
        super(1);
        this.f1768e = i3;
        this.f1769f = collection;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        return Boolean.valueOf(((List) obj).addAll(this.f1768e, this.f1769f));
    }
}
