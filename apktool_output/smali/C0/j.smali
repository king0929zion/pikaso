.class public abstract LC0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC0/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC0/k;-><init>(Z)V

    sput-object v0, LC0/j;->a:LC0/k;

    return-void
.end method

.method public static final a(Lv0/i;LW/o;LW/D;FLW/G;LF0/g;LY/c;I)V
    .locals 12

    move-object v0, p0

    iget-object v0, v0, Lv0/i;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv0/k;

    iget-object v4, v3, Lv0/k;->a:Lv0/a;

    move-object v5, p1

    move-object v6, p2

    move v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move/from16 v11, p7

    invoke-virtual/range {v4 .. v11}, Lv0/a;->f(LW/o;LW/D;FLW/G;LF0/g;LY/c;I)V

    iget-object v3, v3, Lv0/k;->a:Lv0/a;

    invoke-virtual {v3}, Lv0/a;->b()F

    move-result v3

    const/4 v4, 0x0

    move-object v5, p1

    invoke-interface {p1, v4, v3}, LW/o;->o(FF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final b(Landroid/text/TextPaint;F)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    move p1, v0

    :cond_1
    const/16 v0, 0xff

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_2
    return-void
.end method
