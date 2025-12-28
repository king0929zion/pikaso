.class public abstract LZ/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Landroid/widget/EditText;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static B(Lo2/a;)Lc2/d;
    .locals 2

    sget-object v0, Lc2/l;->a:Lc2/l;

    new-instance v1, Lc2/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    check-cast p0, Lp2/h;

    iput-object p0, v1, Lc2/n;->d:Lp2/h;

    iput-object v0, v1, Lc2/n;->e:Ljava/lang/Object;

    return-object v1
.end method

.method public static C(Lo2/a;)Lc2/k;
    .locals 1

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc2/k;

    invoke-direct {v0, p0}, Lc2/k;-><init>(Lo2/a;)V

    return-object v0
.end method

.method public static D(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v0, "singletonList(...)"

    invoke-static {p0, v0}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static E(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V
    .locals 0

    if-eqz p0, :cond_0

    iget-object p0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-nez p0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    :goto_0
    instance-of p1, p0, Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static F(Landroid/widget/EdgeEffect;FF)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lj1/e;->c(Landroid/widget/EdgeEffect;FF)F

    move-result p0

    return p0

    :cond_0
    invoke-static {p0, p1, p2}, Lj1/d;->a(Landroid/widget/EdgeEffect;FF)V

    return p1
.end method

.method public static final K(Lv0/B;LG0/f;)Lv0/B;
    .locals 26

    move-object/from16 v0, p0

    new-instance v2, Lv0/B;

    iget-object v3, v0, Lv0/B;->a:Lv0/v;

    sget-object v4, Lv0/w;->d:LF0/j;

    iget-object v4, v3, Lv0/v;->a:LF0/j;

    sget-object v5, LF0/i;->a:LF0/i;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    :goto_0
    move-object v6, v4

    goto :goto_1

    :cond_0
    sget-object v4, Lv0/w;->d:LF0/j;

    goto :goto_0

    :goto_1
    iget-wide v4, v3, Lv0/v;->b:J

    invoke-static {v4, v5}, La/a;->S(J)Z

    move-result v7

    if-eqz v7, :cond_1

    sget-wide v4, Lv0/w;->a:J

    :cond_1
    move-wide v7, v4

    iget-object v4, v3, Lv0/v;->c:Lz0/l;

    if-nez v4, :cond_2

    sget-object v4, Lz0/l;->f:Lz0/l;

    :cond_2
    move-object v9, v4

    iget-object v4, v3, Lv0/v;->d:Lz0/j;

    if-eqz v4, :cond_3

    iget v4, v4, Lz0/j;->a:I

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    new-instance v10, Lz0/j;

    invoke-direct {v10, v4}, Lz0/j;-><init>(I)V

    iget-object v4, v3, Lv0/v;->e:Lz0/k;

    if-eqz v4, :cond_4

    iget v4, v4, Lz0/k;->a:I

    goto :goto_3

    :cond_4
    const/4 v4, 0x1

    :goto_3
    new-instance v11, Lz0/k;

    invoke-direct {v11, v4}, Lz0/k;-><init>(I)V

    iget-object v4, v3, Lv0/v;->f:Lz0/r;

    if-nez v4, :cond_5

    sget-object v4, Lz0/r;->a:Lz0/c;

    :cond_5
    move-object v12, v4

    iget-object v4, v3, Lv0/v;->g:Ljava/lang/String;

    if-nez v4, :cond_6

    const-string v4, ""

    :cond_6
    move-object v13, v4

    iget-wide v14, v3, Lv0/v;->h:J

    invoke-static {v14, v15}, La/a;->S(J)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-wide v14, Lv0/w;->b:J

    :cond_7
    iget-object v4, v3, Lv0/v;->i:LF0/a;

    if-eqz v4, :cond_8

    iget v4, v4, LF0/a;->a:F

    goto :goto_4

    :cond_8
    const/4 v4, 0x0

    :goto_4
    new-instance v1, LF0/a;

    invoke-direct {v1, v4}, LF0/a;-><init>(F)V

    iget-object v4, v3, Lv0/v;->j:LF0/k;

    if-nez v4, :cond_9

    sget-object v4, LF0/k;->c:LF0/k;

    :cond_9
    move-object/from16 v17, v4

    iget-object v4, v3, Lv0/v;->k:LB0/c;

    if-nez v4, :cond_c

    sget-object v4, LB0/c;->f:LB0/c;

    sget-object v4, LB0/d;->a:LB0/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    move-result-object v5

    move-object/from16 v24, v2

    iget-object v2, v4, LB0/a;->d:Ljava/lang/Object;

    check-cast v2, LX1/e;

    monitor-enter v2

    :try_start_0
    iget-object v0, v4, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, LB0/c;

    if-eqz v0, :cond_a

    move-object/from16 v18, v0

    iget-object v0, v4, LB0/a;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v5, v0, :cond_a

    monitor-exit v2

    move-wide/from16 v19, v14

    move-object/from16 v0, v18

    move-object/from16 v18, v1

    goto :goto_7

    :cond_a
    :try_start_1
    invoke-virtual {v5}, Landroid/os/LocaleList;->size()I

    move-result v0

    move-object/from16 v18, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-wide/from16 v19, v14

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v0, :cond_b

    new-instance v15, LB0/b;

    move/from16 v16, v0

    invoke-virtual {v5, v14}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v15, v0}, LB0/b;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    add-int/2addr v14, v0

    move/from16 v0, v16

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_b
    new-instance v0, LB0/c;

    invoke-direct {v0, v1}, LB0/c;-><init>(Ljava/util/List;)V

    iput-object v5, v4, LB0/a;->b:Ljava/lang/Object;

    iput-object v0, v4, LB0/a;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    goto :goto_7

    :goto_6
    monitor-exit v2

    throw v0

    :cond_c
    move-object/from16 v18, v1

    move-object/from16 v24, v2

    move-wide/from16 v19, v14

    move-object v0, v4

    :goto_7
    iget-wide v1, v3, Lv0/v;->l:J

    const-wide/16 v4, 0x10

    cmp-long v4, v1, v4

    if-eqz v4, :cond_d

    goto :goto_8

    :cond_d
    sget-wide v1, Lv0/w;->c:J

    :goto_8
    iget-object v4, v3, Lv0/v;->m:LF0/g;

    if-nez v4, :cond_e

    sget-object v4, LF0/g;->b:LF0/g;

    :cond_e
    move-object/from16 v21, v4

    iget-object v4, v3, Lv0/v;->n:LW/G;

    if-nez v4, :cond_f

    sget-object v4, LW/G;->d:LW/G;

    :cond_f
    move-object/from16 v22, v4

    iget-object v3, v3, Lv0/v;->o:LY/c;

    if-nez v3, :cond_10

    sget-object v3, LY/f;->b:LY/f;

    :cond_10
    move-object/from16 v23, v3

    new-instance v3, Lv0/v;

    move-object v5, v3

    move-wide/from16 v14, v19

    move-object/from16 v16, v18

    move-object/from16 v18, v0

    move-wide/from16 v19, v1

    invoke-direct/range {v5 .. v23}, Lv0/v;-><init>(LF0/j;JLz0/l;Lz0/j;Lz0/k;Lz0/r;Ljava/lang/String;JLF0/a;LF0/k;LB0/c;JLF0/g;LW/G;LY/c;)V

    sget v0, Lv0/o;->b:I

    new-instance v0, Lv0/n;

    move-object/from16 v1, p0

    iget-object v2, v1, Lv0/B;->b:Lv0/n;

    iget v4, v2, Lv0/n;->a:I

    const/high16 v5, -0x80000000

    invoke-static {v4, v5}, LF0/f;->a(II)Z

    move-result v4

    const/4 v6, 0x5

    if-eqz v4, :cond_11

    move v7, v6

    goto :goto_9

    :cond_11
    iget v4, v2, Lv0/n;->a:I

    move v7, v4

    :goto_9
    iget v4, v2, Lv0/n;->b:I

    const/4 v8, 0x3

    invoke-static {v4, v8}, LF0/h;->a(II)Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_13

    const/4 v8, 0x1

    if-ne v4, v8, :cond_12

    move/from16 v25, v8

    move v8, v6

    move/from16 v6, v25

    goto :goto_b

    :cond_12
    new-instance v0, LB1/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_13
    const/4 v4, 0x4

    move v8, v4

    const/4 v6, 0x1

    goto :goto_b

    :cond_14
    invoke-static {v4, v5}, LF0/h;->a(II)Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_16

    const/4 v6, 0x1

    if-ne v4, v6, :cond_15

    const/4 v4, 0x2

    :goto_a
    move v8, v4

    goto :goto_b

    :cond_15
    new-instance v0, LB1/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_16
    const/4 v6, 0x1

    move v8, v6

    goto :goto_b

    :cond_17
    const/4 v6, 0x1

    goto :goto_a

    :goto_b
    iget-wide v9, v2, Lv0/n;->c:J

    invoke-static {v9, v10}, La/a;->S(J)Z

    move-result v4

    if-eqz v4, :cond_18

    sget-wide v9, Lv0/o;->a:J

    :cond_18
    iget-object v4, v2, Lv0/n;->d:LF0/l;

    if-nez v4, :cond_19

    sget-object v4, LF0/l;->c:LF0/l;

    :cond_19
    move-object v11, v4

    iget v4, v2, Lv0/n;->g:I

    if-nez v4, :cond_1a

    sget v4, La/a;->f:I

    :cond_1a
    move v12, v4

    iget v4, v2, Lv0/n;->h:I

    invoke-static {v4, v5}, Lr2/a;->u(II)Z

    move-result v5

    if-eqz v5, :cond_1b

    move v13, v6

    goto :goto_c

    :cond_1b
    move v13, v4

    :goto_c
    iget-object v4, v2, Lv0/n;->i:LF0/m;

    if-nez v4, :cond_1c

    sget-object v4, LF0/m;->c:LF0/m;

    :cond_1c
    move-object v14, v4

    iget-object v15, v2, Lv0/n;->e:Lv0/p;

    iget-object v2, v2, Lv0/n;->f:LF0/e;

    move-object v4, v0

    move v5, v7

    move v6, v8

    move-wide v7, v9

    move-object v9, v11

    move-object v10, v15

    move-object v11, v2

    invoke-direct/range {v4 .. v14}, Lv0/n;-><init>(IIJLF0/l;Lv0/p;LF0/e;IILF0/m;)V

    iget-object v1, v1, Lv0/B;->c:Lv0/q;

    move-object/from16 v2, v24

    invoke-direct {v2, v3, v0, v1}, Lv0/B;-><init>(Lv0/v;Lv0/n;Lv0/q;)V

    return-object v2
.end method

.method public static N(Lu2/d;)Lu2/b;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lu2/b;->f:I

    if-lez v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    :goto_0
    new-instance v1, Lu2/b;

    iget v2, p0, Lu2/b;->d:I

    iget p0, p0, Lu2/b;->e:I

    invoke-direct {v1, v2, p0, v0}, Lu2/b;-><init>(III)V

    return-object v1
.end method

.method public static final O(ILD/n;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lo0/S;->a:LD/H;

    invoke-virtual {p1, v0}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    sget-object v0, Lo0/S;->b:LD/M0;

    invoke-virtual {p1, v0}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final Q(J)D
    .locals 4

    const/16 v0, 0xb

    ushr-long v0, p0, v0

    long-to-double v0, v0

    const/16 v2, 0x800

    int-to-double v2, v2

    mul-double/2addr v0, v2

    const-wide/16 v2, 0x7ff

    and-long/2addr p0, v2

    long-to-double p0, p0

    add-double/2addr v0, p0

    return-wide v0
.end method

.method public static R(II)Lu2/d;
    .locals 2

    const/high16 v0, -0x80000000

    if-gt p1, v0, :cond_0

    sget-object p0, Lu2/d;->g:Lu2/d;

    sget-object p0, Lu2/d;->g:Lu2/d;

    return-object p0

    :cond_0
    new-instance v0, Lu2/d;

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    invoke-direct {v0, p0, p1, v1}, Lu2/b;-><init>(III)V

    return-object v0
.end method

.method public static final a(I)J
    .locals 6

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    const/4 p0, 0x0

    int-to-long v2, p0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    sget p0, Lg0/a;->n:I

    return-wide v0
.end method

.method public static b(Ljava/lang/String;Lv0/B;JLG0/b;Lz0/e;I)Lv0/a;
    .locals 12

    sget-object v4, Ld2/s;->d:Ld2/s;

    new-instance v11, Lv0/a;

    new-instance v7, LC0/d;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, v4

    move-object/from16 v5, p5

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, LC0/d;-><init>(Ljava/lang/String;Lv0/B;Ljava/util/List;Ljava/util/List;Lz0/e;LG0/b;)V

    const/4 v8, 0x0

    move-object v5, v11

    move-object v6, v7

    move/from16 v7, p6

    move-wide v9, p2

    invoke-direct/range {v5 .. v10}, Lv0/a;-><init>(LC0/d;IZJ)V

    return-object v11
.end method

.method public static final c(Ljava/util/ArrayList;)Z
    .locals 11

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0}, Ld2/l;->T(Ljava/util/List;)I

    move-result v4

    move v5, v1

    :goto_0
    if-ge v5, v4, :cond_3

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lt0/k;

    check-cast v3, Lt0/k;

    invoke-virtual {v3}, Lt0/k;->e()LV/d;

    move-result-object v8

    invoke-virtual {v8}, LV/d;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, LV/c;->b(J)F

    move-result v8

    invoke-virtual {v7}, Lt0/k;->e()LV/d;

    move-result-object v9

    invoke-virtual {v9}, LV/d;->a()J

    move-result-wide v9

    invoke-static {v9, v10}, LV/c;->b(J)F

    move-result v9

    sub-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    invoke-virtual {v3}, Lt0/k;->e()LV/d;

    move-result-object v3

    invoke-virtual {v3}, LV/d;->a()J

    move-result-wide v9

    invoke-static {v9, v10}, LV/c;->c(J)F

    move-result v3

    invoke-virtual {v7}, Lt0/k;->e()LV/d;

    move-result-object v7

    invoke-virtual {v7}, LV/d;->a()J

    move-result-wide v9

    invoke-static {v9, v10}, LV/c;->c(J)F

    move-result v7

    sub-float/2addr v3, v7

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v8, v3}, Lr2/a;->f(FF)J

    move-result-wide v7

    new-instance v3, LV/c;

    invoke-direct {v3, v7, v8}, LV/c;-><init>(J)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v3, v6

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v0, Ld2/s;->d:Ld2/s;

    :cond_3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result p0

    if-ne p0, v2, :cond_4

    invoke-static {v0}, Ld2/k;->a0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LV/c;

    iget-wide v3, p0, LV/c;->a:J

    goto :goto_3

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_7

    invoke-static {v0}, Ld2/k;->a0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Ld2/l;->T(Ljava/util/List;)I

    move-result v3

    if-gt v2, v3, :cond_5

    move v4, v2

    :goto_2
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LV/c;

    iget-wide v5, v5, LV/c;->a:J

    check-cast p0, LV/c;

    iget-wide v7, p0, LV/c;->a:J

    invoke-static {v7, v8, v5, v6}, LV/c;->f(JJ)J

    move-result-wide v5

    new-instance p0, LV/c;

    invoke-direct {p0, v5, v6}, LV/c;-><init>(J)V

    if-eq v4, v3, :cond_5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    check-cast p0, LV/c;

    iget-wide v3, p0, LV/c;->a:J

    :goto_3
    invoke-static {v3, v4}, LV/c;->b(J)F

    move-result p0

    invoke-static {v3, v4}, LV/c;->c(J)F

    move-result v0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    return v2

    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Empty collection can\'t be reduced."

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(F)I
    .locals 2

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p0, v0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method public static e(ZLjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(I)V
    .locals 0

    if-ltz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static g(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static j(DDD)D
    .locals 1

    cmpl-double v0, p2, p4

    if-gtz v0, :cond_2

    cmpg-double v0, p0, p2

    if-gez v0, :cond_0

    return-wide p2

    :cond_0
    cmpl-double p2, p0, p4

    if-lez p2, :cond_1

    return-wide p4

    :cond_1
    return-wide p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Cannot coerce value to an empty range: maximum "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p4, " is less than minimum "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static k(III)I
    .locals 2

    if-gt p1, p2, :cond_2

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    if-nez p1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static m(Landroid/content/Context;)Lo1/r;
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Lo1/c;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, LX1/e;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "Package manager required to locate emoji font provider"

    invoke-static {v1, v2}, LZ/b;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/content/Intent;

    const-string v3, "androidx.content.action.LOAD_EMOJI_FONT"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    if-eqz v4, :cond_1

    iget-object v6, v4, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v6, :cond_1

    iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v7, 0x1

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_1

    goto :goto_1

    :cond_2
    move-object v4, v5

    :goto_1
    if-nez v4, :cond_3

    :goto_2
    move-object v1, v5

    goto :goto_4

    :cond_3
    :try_start_0
    iget-object v2, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, LX1/e;->g(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v6, v0

    :goto_3
    if-ge v3, v6, :cond_4

    aget-object v7, v0, v3

    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, La1/c;

    const-string v3, "emojicompat-emoji-font"

    invoke-direct {v1, v2, v4, v3, v0}, La1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    const-string v1, "emoji2.text.DefaultEmojiConfig"

    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :goto_4
    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    new-instance v5, Lo1/r;

    new-instance v0, Lo1/q;

    invoke-direct {v0, p0, v1}, Lo1/q;-><init>(Landroid/content/Context;La1/c;)V

    invoke-direct {v5, v0}, Lo1/r;-><init>(Lo1/h;)V

    :goto_5
    return-object v5
.end method

.method public static n(Lg2/d;Lg2/d;Lo2/e;)Lg2/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p2, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Li2/a;

    if-eqz v0, :cond_0

    check-cast p2, Li2/a;

    invoke-virtual {p2, p1, p0}, Li2/a;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lg2/d;->o()Lg2/i;

    move-result-object v0

    sget-object v1, Lg2/j;->d:Lg2/j;

    if-ne v0, v1, :cond_1

    new-instance v0, Lh2/b;

    invoke-direct {v0, p1, p0, p2}, Lh2/b;-><init>(Lg2/d;Lg2/d;Lo2/e;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Lh2/c;

    invoke-direct {v1, p1, v0, p2, p0}, Lh2/c;-><init>(Lg2/d;Lg2/i;Lo2/e;Lg2/d;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static final o(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final p(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static q(Landroid/widget/EdgeEffect;)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lj1/e;->b(Landroid/widget/EdgeEffect;)F

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-static {}, Lk/u0;->b()Lk/u0;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lk/u0;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static s()Ljava/util/Set;
    .locals 3

    :try_start_0
    const-string v0, "android.text.EmojiConsistency"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getEmojiConsistencySet"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, [I

    if-nez v2, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-object v0

    :catchall_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static final u(Lt0/g;Lt0/q;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public static final v(Landroid/view/View;)Ll1/a;
    .locals 2

    const v0, 0x7f080142

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/a;

    if-nez v1, :cond_0

    new-instance v1, Ll1/a;

    invoke-direct {v1}, Ll1/a;-><init>()V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static final w(Ln0/M;)Ln0/M;
    .locals 2

    iget-object p0, p0, Ln0/M;->n:Ln0/Y;

    iget-object p0, p0, Ln0/Y;->n:Ln0/z;

    :goto_0
    invoke-virtual {p0}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln0/z;->f:Ln0/z;

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, v0, Ln0/z;->f:Ln0/z;

    :cond_1
    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ln0/z;->k()Ln0/z;

    move-result-object p0

    invoke-static {p0}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object p0, p0, Ln0/z;->f:Ln0/z;

    invoke-static {p0}, Lp2/g;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object p0, p0, Ln0/z;->x:LD/s;

    iget-object p0, p0, LD/s;->d:Ljava/lang/Object;

    check-cast p0, Ln0/Y;

    invoke-virtual {p0}, Ln0/Y;->o0()Ln0/M;

    move-result-object p0

    invoke-static {p0}, Lp2/g;->b(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static z(Lg2/d;)Lg2/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Li2/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Li2/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object p0, v0, Li2/c;->f:Lg2/d;

    if-nez p0, :cond_2

    invoke-virtual {v0}, Li2/c;->o()Lg2/i;

    move-result-object p0

    sget-object v1, Lg2/e;->d:Lg2/e;

    invoke-interface {p0, v1}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object p0

    check-cast p0, Lg2/f;

    if-eqz p0, :cond_1

    check-cast p0, Ly2/r;

    new-instance v1, LD2/g;

    invoke-direct {v1, p0, v0}, LD2/g;-><init>(Ly2/r;Li2/c;)V

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    iput-object v1, v0, Li2/c;->f:Lg2/d;

    move-object p0, v1

    :cond_2
    return-object p0
.end method


# virtual methods
.method public G(Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public abstract H(I)V
.end method

.method public abstract I(Landroid/view/View;II)V
.end method

.method public abstract J(Landroid/view/View;FF)V
.end method

.method public abstract L(Z)V
.end method

.method public abstract M(Z)V
.end method

.method public abstract P(Landroid/view/View;I)Z
.end method

.method public abstract h(Landroid/view/View;I)I
.end method

.method public abstract i(Landroid/view/View;I)I
.end method

.method public abstract t([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
.end method

.method public x(Landroid/view/View;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public y()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
