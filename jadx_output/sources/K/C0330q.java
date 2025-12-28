package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.ai.assistance.operit.provider.R;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330q {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4856a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4857b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4858c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4859d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e, reason: collision with root package name */
    public final int[] f4860e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4861f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static boolean a(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i3) {
        int c3 = J0.c(context, R.attr.colorControlHighlight);
        int b3 = J0.b(context, R.attr.colorButtonNormal);
        int[] iArr = J0.f4687b;
        int[] iArr2 = J0.f4689d;
        int b4 = V0.a.b(c3, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, J0.f4688c, J0.f4691f}, new int[]{b3, b4, V0.a.b(c3, i3), i3});
    }

    public static LayerDrawable c(C0338u0 c0338u0, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        Drawable c3 = c0338u0.c(context, R.drawable.abc_star_black_48dp);
        Drawable c4 = c0338u0.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c3 instanceof BitmapDrawable) && c3.getIntrinsicWidth() == dimensionPixelSize && c3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c3;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c3.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c4 instanceof BitmapDrawable) && c4.getIntrinsicWidth() == dimensionPixelSize && c4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c4;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c4.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i3) {
        PorterDuff.Mode mode = r.f4862b;
        int[] iArr = U.f4718a;
        drawable.mutate().setColorFilter(r.b(i3, mode));
    }

    public final ColorStateList d(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return r2.a.y(context, R.color.abc_tint_edittext);
        }
        if (i3 == R.drawable.abc_switch_track_mtrl_alpha) {
            return r2.a.y(context, R.color.abc_tint_switch_track);
        }
        if (i3 != R.drawable.abc_switch_thumb_material) {
            if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, J0.c(context, R.attr.colorButtonNormal));
            }
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return b(context, J0.c(context, R.attr.colorAccent));
            }
            if (i3 == R.drawable.abc_spinner_mtrl_am_alpha || i3 == R.drawable.abc_spinner_textfield_background_material) {
                return r2.a.y(context, R.color.abc_tint_spinner);
            }
            if (a(this.f4857b, i3)) {
                return J0.d(context, R.attr.colorControlNormal);
            }
            if (a(this.f4860e, i3)) {
                return r2.a.y(context, R.color.abc_tint_default);
            }
            if (a(this.f4861f, i3)) {
                return r2.a.y(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return r2.a.y(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d3 = J0.d(context, R.attr.colorSwitchThumbNormal);
        if (d3 == null || !d3.isStateful()) {
            iArr[0] = J0.f4687b;
            iArr2[0] = J0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = J0.f4690e;
            iArr2[1] = J0.c(context, R.attr.colorControlActivated);
            iArr[2] = J0.f4691f;
            iArr2[2] = J0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = J0.f4687b;
            iArr[0] = iArr3;
            iArr2[0] = d3.getColorForState(iArr3, 0);
            iArr[1] = J0.f4690e;
            iArr2[1] = J0.c(context, R.attr.colorControlActivated);
            iArr[2] = J0.f4691f;
            iArr2[2] = d3.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
