package k;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.ai.assistance.operit.provider.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import k1.C0348a;

/* loaded from: classes.dex */
public final class I0 extends k1.b implements View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f4663A = 0;

    /* renamed from: k, reason: collision with root package name */
    public final int f4664k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4665l;

    /* renamed from: m, reason: collision with root package name */
    public final LayoutInflater f4666m;

    /* renamed from: n, reason: collision with root package name */
    public final SearchView f4667n;

    /* renamed from: o, reason: collision with root package name */
    public final SearchableInfo f4668o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f4669p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f4670q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4671r;

    /* renamed from: s, reason: collision with root package name */
    public int f4672s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f4673t;

    /* renamed from: u, reason: collision with root package name */
    public int f4674u;

    /* renamed from: v, reason: collision with root package name */
    public int f4675v;

    /* renamed from: w, reason: collision with root package name */
    public int f4676w;

    /* renamed from: x, reason: collision with root package name */
    public int f4677x;

    /* renamed from: y, reason: collision with root package name */
    public int f4678y;

    /* renamed from: z, reason: collision with root package name */
    public int f4679z;

    public I0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f4905e = true;
        this.f4906f = null;
        this.f4904d = false;
        this.f4907g = -1;
        this.h = new C0348a(this);
        this.f4908i = new C0317j0(1, this);
        this.f4665l = suggestionRowLayout;
        this.f4664k = suggestionRowLayout;
        this.f4666m = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f4672s = 1;
        this.f4674u = -1;
        this.f4675v = -1;
        this.f4676w = -1;
        this.f4677x = -1;
        this.f4678y = -1;
        this.f4679z = -1;
        this.f4667n = searchView;
        this.f4668o = searchableInfo;
        this.f4671r = searchView.getSuggestionCommitIconResId();
        this.f4669p = context;
        this.f4670q = weakHashMap;
    }

    public static String h(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    @Override // k1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.I0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // k1.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f4674u = cursor.getColumnIndex("suggest_text_1");
                this.f4675v = cursor.getColumnIndex("suggest_text_2");
                this.f4676w = cursor.getColumnIndex("suggest_text_2_url");
                this.f4677x = cursor.getColumnIndex("suggest_icon_1");
                this.f4678y = cursor.getColumnIndex("suggest_icon_2");
                this.f4679z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // k1.b
    public final String c(Cursor cursor) {
        String h;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        SearchableInfo searchableInfo = this.f4668o;
        if (searchableInfo.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    @Override // k1.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f4666m.inflate(this.f4664k, viewGroup, false);
        inflate.setTag(new H0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f4671r);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f4669p.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.I0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f4669p.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // k1.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View inflate = this.f4666m.inflate(this.f4665l, viewGroup, false);
            if (inflate != null) {
                ((H0) inflate.getTag()).f4657a.setText(e3.toString());
            }
            return inflate;
        }
    }

    @Override // k1.b, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View d3 = d(viewGroup);
            ((H0) d3.getTag()).f4657a.setText(e3.toString());
            return d3;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f4906f;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f4906f;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f4667n.o((CharSequence) tag);
        }
    }
}
