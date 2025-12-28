.class public final LC0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv0/m;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lv0/B;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lz0/e;

.field public final f:LG0/b;

.field public final g:LC0/e;

.field public final h:Ljava/lang/CharSequence;

.field public final i:Lw0/l;

.field public j:LB0/a;

.field public final k:Z

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lv0/B;Ljava/util/List;Ljava/util/List;Lz0/e;LG0/b;)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    const-wide v7, 0x100000000L

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v12, p1

    iput-object v12, v1, LC0/d;->a:Ljava/lang/String;

    iput-object v0, v1, LC0/d;->b:Lv0/B;

    move-object/from16 v12, p3

    iput-object v12, v1, LC0/d;->c:Ljava/util/List;

    move-object/from16 v13, p4

    iput-object v13, v1, LC0/d;->d:Ljava/util/List;

    iput-object v2, v1, LC0/d;->e:Lz0/e;

    iput-object v3, v1, LC0/d;->f:LG0/b;

    new-instance v13, LC0/e;

    invoke-interface/range {p6 .. p6}, LG0/b;->n()F

    move-result v14

    invoke-direct {v13, v11}, Landroid/text/TextPaint;-><init>(I)V

    iput v14, v13, Landroid/text/TextPaint;->density:F

    sget-object v14, LF0/g;->b:LF0/g;

    iput-object v14, v13, LC0/e;->b:LF0/g;

    const/4 v14, 0x3

    iput v14, v13, LC0/e;->c:I

    sget-object v15, LW/G;->d:LW/G;

    iput-object v15, v13, LC0/e;->d:LW/G;

    iput-object v13, v1, LC0/d;->g:LC0/e;

    iget-object v15, v0, Lv0/B;->c:Lv0/q;

    sget-object v15, LC0/i;->a:LA/t;

    sget-object v15, LC0/i;->a:LA/t;

    iget-object v4, v15, LA/t;->e:Ljava/lang/Object;

    check-cast v4, LD/L0;

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lo1/i;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v15}, LA/t;->x()LD/L0;

    move-result-object v4

    iput-object v4, v15, LA/t;->e:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sget-object v4, LC0/j;->a:LC0/k;

    :goto_0
    invoke-interface {v4}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iput-boolean v4, v1, LC0/d;->k:Z

    iget-object v4, v0, Lv0/B;->b:Lv0/n;

    iget v4, v4, Lv0/n;->b:I

    iget-object v15, v0, Lv0/B;->a:Lv0/v;

    iget-object v15, v15, Lv0/v;->k:LB0/c;

    const/4 v5, 0x4

    invoke-static {v4, v5}, LF0/h;->a(II)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    :goto_1
    move v4, v9

    goto :goto_3

    :cond_3
    const/4 v5, 0x5

    invoke-static {v4, v5}, LF0/h;->a(II)Z

    move-result v5

    if-eqz v5, :cond_5

    :cond_4
    move v4, v14

    goto :goto_3

    :cond_5
    invoke-static {v4, v11}, LF0/h;->a(II)Z

    move-result v5

    if-eqz v5, :cond_6

    move v4, v10

    goto :goto_3

    :cond_6
    invoke-static {v4, v9}, LF0/h;->a(II)Z

    move-result v5

    if-eqz v5, :cond_7

    move v4, v11

    goto :goto_3

    :cond_7
    invoke-static {v4, v14}, LF0/h;->a(II)Z

    move-result v5

    if-eqz v5, :cond_8

    move v4, v11

    goto :goto_2

    :cond_8
    const/high16 v5, -0x80000000

    invoke-static {v4, v5}, LF0/h;->a(II)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_77

    if-eqz v15, :cond_9

    iget-object v4, v15, LB0/c;->d:Ljava/util/List;

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LB0/b;

    iget-object v4, v4, LB0/b;->a:Ljava/util/Locale;

    if-nez v4, :cond_a

    :cond_9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    :cond_a
    invoke-static {v4}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v4

    if-eqz v4, :cond_2

    if-eq v4, v11, :cond_4

    goto :goto_1

    :goto_3
    iput v4, v1, LC0/d;->l:I

    new-instance v4, LC0/c;

    invoke-direct {v4, v1}, LC0/c;-><init>(LC0/d;)V

    iget-object v5, v0, Lv0/B;->b:Lv0/n;

    iget-object v5, v5, Lv0/n;->i:LF0/m;

    if-nez v5, :cond_b

    sget-object v5, LF0/m;->c:LF0/m;

    :cond_b
    iget-boolean v6, v5, LF0/m;->b:Z

    if-eqz v6, :cond_c

    invoke-virtual {v13}, Landroid/graphics/Paint;->getFlags()I

    move-result v6

    or-int/lit16 v6, v6, 0x80

    goto :goto_4

    :cond_c
    invoke-virtual {v13}, Landroid/graphics/Paint;->getFlags()I

    move-result v6

    and-int/lit16 v6, v6, -0x81

    :goto_4
    invoke-virtual {v13, v6}, Landroid/graphics/Paint;->setFlags(I)V

    iget v5, v5, LF0/m;->a:I

    if-ne v5, v11, :cond_d

    move v6, v11

    goto :goto_5

    :cond_d
    move v6, v10

    :goto_5
    if-eqz v6, :cond_e

    invoke-virtual {v13}, Landroid/graphics/Paint;->getFlags()I

    move-result v5

    or-int/lit8 v5, v5, 0x40

    invoke-virtual {v13, v5}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {v13, v10}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_8

    :cond_e
    if-ne v5, v9, :cond_f

    move v6, v11

    goto :goto_6

    :cond_f
    move v6, v10

    :goto_6
    if-eqz v6, :cond_10

    invoke-virtual {v13}, Landroid/graphics/Paint;->getFlags()I

    invoke-virtual {v13, v11}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_8

    :cond_10
    if-ne v5, v14, :cond_11

    move v5, v11

    goto :goto_7

    :cond_11
    move v5, v10

    :goto_7
    if-eqz v5, :cond_12

    invoke-virtual {v13}, Landroid/graphics/Paint;->getFlags()I

    invoke-virtual {v13, v10}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_8

    :cond_12
    invoke-virtual {v13}, Landroid/graphics/Paint;->getFlags()I

    :goto_8
    iget-object v0, v0, Lv0/B;->a:Lv0/v;

    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    iget-wide v14, v0, Lv0/v;->b:J

    invoke-static {v14, v15}, LG0/h;->b(J)J

    move-result-wide v14

    invoke-static {v14, v15, v7, v8}, LG0/i;->a(JJ)Z

    move-result v6

    iget-wide v9, v0, Lv0/v;->b:J

    if-eqz v6, :cond_13

    invoke-interface {v3, v9, v10}, LG0/b;->v(J)F

    move-result v6

    invoke-virtual {v13, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_9

    :cond_13
    const-wide v7, 0x200000000L

    invoke-static {v14, v15, v7, v8}, LG0/i;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-virtual {v13}, Landroid/graphics/Paint;->getTextSize()F

    move-result v6

    invoke-static {v9, v10}, LG0/h;->c(J)F

    move-result v7

    mul-float/2addr v7, v6

    invoke-virtual {v13, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_14
    :goto_9
    iget-object v6, v0, Lv0/v;->f:Lz0/r;

    if-nez v6, :cond_16

    iget-object v7, v0, Lv0/v;->d:Lz0/j;

    if-nez v7, :cond_16

    iget-object v7, v0, Lv0/v;->c:Lz0/l;

    if-eqz v7, :cond_15

    goto :goto_a

    :cond_15
    const/4 v7, 0x0

    goto :goto_b

    :cond_16
    :goto_a
    move v7, v11

    :goto_b
    if-eqz v7, :cond_1b

    iget-object v7, v0, Lv0/v;->c:Lz0/l;

    if-nez v7, :cond_17

    sget-object v7, Lz0/l;->f:Lz0/l;

    :cond_17
    iget-object v8, v0, Lv0/v;->d:Lz0/j;

    if-eqz v8, :cond_18

    iget v8, v8, Lz0/j;->a:I

    goto :goto_c

    :cond_18
    const/4 v8, 0x0

    :goto_c
    iget-object v9, v0, Lv0/v;->e:Lz0/k;

    if-eqz v9, :cond_19

    iget v9, v9, Lz0/k;->a:I

    goto :goto_d

    :cond_19
    move v9, v11

    :goto_d
    check-cast v2, Lz0/f;

    invoke-virtual {v2, v6, v7, v8, v9}, Lz0/f;->b(Lz0/r;Lz0/l;II)Lz0/t;

    move-result-object v2

    instance-of v6, v2, Lz0/t;

    const-string v7, "null cannot be cast to non-null type android.graphics.Typeface"

    if-nez v6, :cond_1a

    new-instance v6, LB0/a;

    iget-object v8, v1, LC0/d;->j:LB0/a;

    invoke-direct {v6, v2, v8}, LB0/a;-><init>(Lz0/t;LB0/a;)V

    iput-object v6, v1, LC0/d;->j:LB0/a;

    iget-object v2, v6, LB0/a;->d:Ljava/lang/Object;

    invoke-static {v2, v7}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/graphics/Typeface;

    goto :goto_e

    :cond_1a
    iget-object v2, v2, Lz0/t;->d:Ljava/lang/Object;

    invoke-static {v2, v7}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/graphics/Typeface;

    :goto_e
    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_1b
    iget-object v2, v0, Lv0/v;->k:LB0/c;

    if-eqz v2, :cond_1e

    sget-object v6, LB0/c;->f:LB0/c;

    sget-object v6, LB0/d;->a:LB0/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    move-result-object v7

    iget-object v8, v6, LB0/a;->d:Ljava/lang/Object;

    check-cast v8, LX1/e;

    monitor-enter v8

    :try_start_0
    iget-object v9, v6, LB0/a;->c:Ljava/lang/Object;

    check-cast v9, LB0/c;

    if-eqz v9, :cond_1c

    iget-object v10, v6, LB0/a;->b:Ljava/lang/Object;

    check-cast v10, Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v7, v10, :cond_1c

    monitor-exit v8

    goto :goto_10

    :cond_1c
    :try_start_1
    invoke-virtual {v7}, Landroid/os/LocaleList;->size()I

    move-result v9

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v14, 0x0

    :goto_f
    if-ge v14, v9, :cond_1d

    new-instance v15, LB0/b;

    invoke-virtual {v7, v14}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v11

    invoke-direct {v15, v11}, LB0/b;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x1

    add-int/2addr v14, v11

    goto :goto_f

    :catchall_0
    move-exception v0

    goto :goto_11

    :cond_1d
    new-instance v9, LB0/c;

    invoke-direct {v9, v10}, LB0/c;-><init>(Ljava/util/List;)V

    iput-object v7, v6, LB0/a;->b:Ljava/lang/Object;

    iput-object v9, v6, LB0/a;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v8

    :goto_10
    invoke-virtual {v2, v9}, LB0/c;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1e

    sget-object v6, LD0/a;->a:LD0/a;

    invoke-virtual {v6, v13, v2}, LD0/a;->b(LC0/e;LB0/c;)V

    goto :goto_12

    :goto_11
    monitor-exit v8

    throw v0

    :cond_1e
    :goto_12
    iget-object v2, v0, Lv0/v;->g:Ljava/lang/String;

    if-eqz v2, :cond_1f

    const-string v6, ""

    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1f
    iget-object v2, v0, Lv0/v;->j:LF0/k;

    if-eqz v2, :cond_20

    sget-object v6, LF0/k;->c:LF0/k;

    invoke-virtual {v2, v6}, LF0/k;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    invoke-virtual {v13}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v6

    iget v7, v2, LF0/k;->a:F

    mul-float/2addr v6, v7

    invoke-virtual {v13, v6}, Landroid/graphics/Paint;->setTextScaleX(F)V

    invoke-virtual {v13}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v6

    iget v2, v2, LF0/k;->b:F

    add-float/2addr v6, v2

    invoke-virtual {v13, v6}, Landroid/graphics/Paint;->setTextSkewX(F)V

    :cond_20
    iget-object v2, v0, Lv0/v;->a:LF0/j;

    invoke-interface {v2}, LF0/j;->b()J

    move-result-wide v6

    invoke-virtual {v13, v6, v7}, LC0/e;->d(J)V

    invoke-interface {v2}, LF0/j;->c()LW/D;

    move-result-object v6

    invoke-interface {v2}, LF0/j;->a()F

    move-result v2

    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-virtual {v13, v6, v7, v8, v2}, LC0/e;->c(LW/D;JF)V

    iget-object v2, v0, Lv0/v;->n:LW/G;

    invoke-virtual {v13, v2}, LC0/e;->f(LW/G;)V

    iget-object v2, v0, Lv0/v;->m:LF0/g;

    invoke-virtual {v13, v2}, LC0/e;->g(LF0/g;)V

    iget-object v2, v0, Lv0/v;->o:LY/c;

    invoke-virtual {v13, v2}, LC0/e;->e(LY/c;)V

    iget-wide v6, v0, Lv0/v;->h:J

    invoke-static {v6, v7}, LG0/h;->b(J)J

    move-result-wide v8

    const-wide v10, 0x100000000L

    invoke-static {v8, v9, v10, v11}, LG0/i;->a(JJ)Z

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_23

    invoke-static {v6, v7}, LG0/h;->c(J)F

    move-result v2

    cmpg-float v2, v2, v8

    if-nez v2, :cond_21

    goto :goto_13

    :cond_21
    invoke-virtual {v13}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    invoke-virtual {v13}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v9

    mul-float/2addr v9, v2

    invoke-interface {v3, v6, v7}, LG0/b;->v(J)F

    move-result v2

    cmpg-float v3, v9, v8

    if-nez v3, :cond_22

    goto :goto_14

    :cond_22
    div-float/2addr v2, v9

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_14

    :cond_23
    :goto_13
    invoke-static {v6, v7}, LG0/h;->b(J)J

    move-result-wide v2

    const-wide v9, 0x200000000L

    invoke-static {v2, v3, v9, v10}, LG0/i;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-static {v6, v7}, LG0/h;->c(J)F

    move-result v2

    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    :cond_24
    :goto_14
    if-nez v5, :cond_26

    invoke-static {v6, v7}, LG0/h;->b(J)J

    move-result-wide v2

    const-wide v9, 0x100000000L

    invoke-static {v2, v3, v9, v10}, LG0/i;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_26

    invoke-static {v6, v7}, LG0/h;->c(J)F

    move-result v2

    cmpg-float v2, v2, v8

    if-nez v2, :cond_25

    goto :goto_15

    :cond_25
    const/4 v2, 0x1

    goto :goto_16

    :cond_26
    :goto_15
    const/4 v2, 0x0

    :goto_16
    sget-wide v9, LW/r;->f:J

    iget-wide v13, v0, Lv0/v;->l:J

    invoke-static {v13, v14, v9, v10}, LW/r;->c(JJ)Z

    move-result v3

    move-wide/from16 p4, v9

    if-nez v3, :cond_27

    sget-wide v8, LW/r;->e:J

    invoke-static {v13, v14, v8, v9}, LW/r;->c(JJ)Z

    move-result v3

    if-nez v3, :cond_27

    const/4 v3, 0x1

    goto :goto_17

    :cond_27
    const/4 v3, 0x0

    :goto_17
    iget-object v0, v0, Lv0/v;->i:LF0/a;

    if-eqz v0, :cond_29

    iget v5, v0, LF0/a;->a:F

    const/4 v8, 0x0

    invoke-static {v5, v8}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-nez v5, :cond_28

    goto :goto_18

    :cond_28
    const/4 v5, 0x1

    goto :goto_19

    :cond_29
    :goto_18
    const/4 v5, 0x0

    :goto_19
    if-nez v2, :cond_2a

    if-nez v3, :cond_2a

    if-nez v5, :cond_2a

    const/4 v0, 0x0

    goto :goto_1e

    :cond_2a
    if-eqz v2, :cond_2b

    :goto_1a
    move-wide/from16 v26, v6

    goto :goto_1b

    :cond_2b
    sget-wide v6, LG0/h;->c:J

    goto :goto_1a

    :goto_1b
    if-eqz v3, :cond_2c

    move-wide/from16 v31, v13

    goto :goto_1c

    :cond_2c
    move-wide/from16 v31, p4

    :goto_1c
    if-eqz v5, :cond_2d

    move-object/from16 v28, v0

    goto :goto_1d

    :cond_2d
    const/16 v28, 0x0

    :goto_1d
    new-instance v0, Lv0/v;

    move-object/from16 v16, v0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const v35, 0xf67f

    invoke-direct/range {v16 .. v35}, Lv0/v;-><init>(JJLz0/l;Lz0/j;Lz0/k;Lz0/r;Ljava/lang/String;JLF0/a;LF0/k;LB0/c;JLF0/g;LW/G;I)V

    :goto_1e
    if-eqz v0, :cond_30

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_1f
    if-ge v5, v2, :cond_2f

    if-nez v5, :cond_2e

    new-instance v6, Lv0/b;

    iget-object v7, v1, LC0/d;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v9, 0x0

    invoke-direct {v6, v9, v7, v0}, Lv0/b;-><init>(IILjava/lang/Object;)V

    const/4 v7, 0x1

    goto :goto_20

    :cond_2e
    iget-object v6, v1, LC0/d;->c:Ljava/util/List;

    const/4 v7, 0x1

    add-int/lit8 v9, v5, -0x1

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv0/b;

    :goto_20
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, v7

    goto :goto_1f

    :cond_2f
    move-object v12, v3

    :cond_30
    iget-object v0, v1, LC0/d;->a:Ljava/lang/String;

    iget-object v2, v1, LC0/d;->g:LC0/e;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    iget-object v3, v1, LC0/d;->b:Lv0/B;

    iget-object v5, v1, LC0/d;->d:Ljava/util/List;

    iget-object v6, v1, LC0/d;->f:LG0/b;

    iget-boolean v7, v1, LC0/d;->k:Z

    sget-object v9, LC0/b;->a:LC0/a;

    if-eqz v7, :cond_32

    invoke-static {}, Lo1/i;->c()Z

    move-result v7

    if-eqz v7, :cond_32

    iget-object v7, v3, Lv0/B;->c:Lv0/q;

    if-eqz v7, :cond_31

    iget-object v7, v7, Lv0/q;->a:Lv0/p;

    :cond_31
    invoke-static {}, Lo1/i;->a()Lo1/i;

    move-result-object v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x0

    invoke-virtual {v7, v10, v9, v10, v0}, Lo1/i;->f(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-static {v7}, Lp2/g;->b(Ljava/lang/Object;)V

    goto :goto_21

    :cond_32
    move-object v7, v0

    :goto_21
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_33

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_33

    iget-object v9, v3, Lv0/B;->b:Lv0/n;

    iget-object v9, v9, Lv0/n;->d:LF0/l;

    sget-object v10, LF0/l;->c:LF0/l;

    invoke-static {v9, v10}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_33

    iget-object v9, v3, Lv0/B;->b:Lv0/n;

    iget-wide v9, v9, Lv0/n;->c:J

    invoke-static {v9, v10}, La/a;->S(J)Z

    move-result v9

    if-eqz v9, :cond_33

    goto/16 :goto_4f

    :cond_33
    instance-of v9, v7, Landroid/text/Spannable;

    if-eqz v9, :cond_34

    check-cast v7, Landroid/text/Spannable;

    goto :goto_22

    :cond_34
    new-instance v9, Landroid/text/SpannableString;

    invoke-direct {v9, v7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v7, v9

    :goto_22
    iget-object v9, v3, Lv0/B;->a:Lv0/v;

    iget-object v9, v9, Lv0/v;->m:LF0/g;

    sget-object v10, LF0/g;->c:LF0/g;

    invoke-static {v9, v10}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_35

    sget-object v9, LC0/b;->a:LC0/a;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v10, 0x0

    const/16 v11, 0x21

    invoke-interface {v7, v9, v10, v0, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_35
    iget-object v0, v3, Lv0/B;->b:Lv0/n;

    iget-object v9, v0, Lv0/n;->f:LF0/e;

    if-nez v9, :cond_36

    sget-object v9, LF0/e;->c:LF0/e;

    :cond_36
    iget-wide v10, v0, Lv0/n;->c:J

    invoke-static {v10, v11}, LG0/h;->b(J)J

    move-result-wide v13

    move-object v15, v9

    const-wide v8, 0x100000000L

    invoke-static {v13, v14, v8, v9}, LG0/i;->a(JJ)Z

    move-result v16

    if-eqz v16, :cond_38

    invoke-interface {v6}, LG0/b;->f()F

    move-result v8

    float-to-double v8, v8

    const-wide v13, 0x3ff0cccccccccccdL    # 1.05

    cmpl-double v8, v8, v13

    if-lez v8, :cond_37

    invoke-interface {v6, v2}, LG0/b;->J(F)J

    move-result-wide v8

    invoke-static {v10, v11}, LG0/h;->c(J)F

    move-result v10

    invoke-static {v8, v9}, LG0/h;->c(J)F

    move-result v8

    div-float/2addr v10, v8

    mul-float/2addr v10, v2

    :goto_23
    move/from16 v17, v10

    goto :goto_24

    :cond_37
    invoke-interface {v6, v10, v11}, LG0/b;->v(J)F

    move-result v10

    goto :goto_23

    :cond_38
    const-wide v8, 0x200000000L

    invoke-static {v13, v14, v8, v9}, LG0/i;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_39

    invoke-static {v10, v11}, LG0/h;->c(J)F

    move-result v8

    mul-float v10, v8, v2

    goto :goto_23

    :cond_39
    const/high16 v10, 0x7fc00000    # Float.NaN

    goto :goto_23

    :goto_24
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_3f

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-nez v8, :cond_3a

    goto :goto_25

    :cond_3a
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-eqz v8, :cond_3e

    invoke-static {v7}, Lx2/j;->g(Ljava/lang/CharSequence;)I

    move-result v8

    invoke-interface {v7, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    const/16 v9, 0xa

    if-ne v8, v9, :cond_3b

    :goto_25
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const/4 v9, 0x1

    add-int/2addr v8, v9

    :goto_26
    move/from16 v18, v8

    goto :goto_27

    :cond_3b
    const/4 v9, 0x1

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v8

    goto :goto_26

    :goto_27
    new-instance v8, Lx0/g;

    move-object v10, v15

    iget v11, v10, LF0/e;->b:I

    and-int/lit8 v13, v11, 0x1

    if-lez v13, :cond_3c

    const/16 v19, 0x1

    goto :goto_28

    :cond_3c
    const/16 v19, 0x0

    :goto_28
    and-int/lit8 v9, v11, 0x10

    if-lez v9, :cond_3d

    const/16 v20, 0x1

    goto :goto_29

    :cond_3d
    const/16 v20, 0x0

    :goto_29
    iget v9, v10, LF0/e;->a:F

    move-object/from16 v16, v8

    move/from16 v21, v9

    invoke-direct/range {v16 .. v21}, Lx0/g;-><init>(FIZZF)V

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v9

    const/4 v10, 0x0

    const/16 v11, 0x21

    invoke-interface {v7, v8, v10, v9, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_2a

    :cond_3e
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "Char sequence is empty."

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    const/4 v10, 0x0

    :goto_2a
    iget-object v0, v0, Lv0/n;->d:LF0/l;

    if-eqz v0, :cond_46

    invoke-static {v10}, La/a;->L(I)J

    move-result-wide v8

    iget-wide v13, v0, LF0/l;->a:J

    invoke-static {v13, v14, v8, v9}, LG0/h;->a(JJ)Z

    move-result v8

    iget-wide v0, v0, LF0/l;->b:J

    if-eqz v8, :cond_40

    invoke-static {v10}, La/a;->L(I)J

    move-result-wide v8

    invoke-static {v0, v1, v8, v9}, LG0/h;->a(JJ)Z

    move-result v8

    if-nez v8, :cond_46

    :cond_40
    invoke-static {v13, v14}, La/a;->S(J)Z

    move-result v8

    if-nez v8, :cond_46

    invoke-static {v0, v1}, La/a;->S(J)Z

    move-result v8

    if-eqz v8, :cond_41

    goto :goto_2d

    :cond_41
    invoke-static {v13, v14}, LG0/h;->b(J)J

    move-result-wide v8

    const-wide v10, 0x100000000L

    invoke-static {v8, v9, v10, v11}, LG0/i;->a(JJ)Z

    move-result v15

    if-eqz v15, :cond_42

    invoke-interface {v6, v13, v14}, LG0/b;->v(J)F

    move-result v8

    const-wide v10, 0x200000000L

    goto :goto_2b

    :cond_42
    const-wide v10, 0x200000000L

    invoke-static {v8, v9, v10, v11}, LG0/i;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_43

    invoke-static {v13, v14}, LG0/h;->c(J)F

    move-result v8

    mul-float/2addr v8, v2

    goto :goto_2b

    :cond_43
    const/4 v8, 0x0

    :goto_2b
    invoke-static {v0, v1}, LG0/h;->b(J)J

    move-result-wide v13

    const-wide v10, 0x100000000L

    invoke-static {v13, v14, v10, v11}, LG0/i;->a(JJ)Z

    move-result v9

    if-eqz v9, :cond_44

    invoke-interface {v6, v0, v1}, LG0/b;->v(J)F

    move-result v0

    goto :goto_2c

    :cond_44
    const-wide v9, 0x200000000L

    invoke-static {v13, v14, v9, v10}, LG0/i;->a(JJ)Z

    move-result v11

    if-eqz v11, :cond_45

    invoke-static {v0, v1}, LG0/h;->c(J)F

    move-result v0

    mul-float/2addr v0, v2

    goto :goto_2c

    :cond_45
    const/4 v0, 0x0

    :goto_2c
    new-instance v1, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v2, v8

    float-to-int v2, v2

    float-to-double v8, v0

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v0, v8

    float-to-int v0, v0

    invoke-direct {v1, v2, v0}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x0

    const/16 v8, 0x21

    invoke-interface {v7, v1, v2, v0, v8}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_46
    :goto_2d
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_2e
    if-ge v2, v1, :cond_4b

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lv0/b;

    iget-object v9, v9, Lv0/b;->a:Ljava/lang/Object;

    move-object v10, v9

    check-cast v10, Lv0/v;

    iget-object v11, v10, Lv0/v;->f:Lz0/r;

    if-nez v11, :cond_48

    iget-object v11, v10, Lv0/v;->d:Lz0/j;

    if-nez v11, :cond_48

    iget-object v10, v10, Lv0/v;->c:Lz0/l;

    if-eqz v10, :cond_47

    goto :goto_2f

    :cond_47
    const/4 v10, 0x0

    goto :goto_30

    :cond_48
    :goto_2f
    const/4 v10, 0x1

    :goto_30
    if-nez v10, :cond_4a

    check-cast v9, Lv0/v;

    iget-object v9, v9, Lv0/v;->e:Lz0/k;

    if-eqz v9, :cond_49

    goto :goto_32

    :cond_49
    :goto_31
    const/4 v8, 0x1

    goto :goto_33

    :cond_4a
    :goto_32
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_31

    :goto_33
    add-int/2addr v2, v8

    goto :goto_2e

    :cond_4b
    iget-object v1, v3, Lv0/B;->a:Lv0/v;

    iget-object v2, v1, Lv0/v;->f:Lz0/r;

    if-nez v2, :cond_4d

    iget-object v3, v1, Lv0/v;->d:Lz0/j;

    if-nez v3, :cond_4d

    iget-object v3, v1, Lv0/v;->c:Lz0/l;

    if-eqz v3, :cond_4c

    goto :goto_34

    :cond_4c
    const/4 v3, 0x0

    goto :goto_35

    :cond_4d
    :goto_34
    const/4 v3, 0x1

    :goto_35
    if-nez v3, :cond_4f

    iget-object v3, v1, Lv0/v;->e:Lz0/k;

    if-eqz v3, :cond_4e

    goto :goto_36

    :cond_4e
    const/4 v3, 0x0

    goto :goto_37

    :cond_4f
    :goto_36
    new-instance v3, Lv0/v;

    move-object/from16 v16, v3

    iget-object v8, v1, Lv0/v;->c:Lz0/l;

    move-object/from16 v21, v8

    iget-object v8, v1, Lv0/v;->d:Lz0/j;

    move-object/from16 v22, v8

    iget-object v1, v1, Lv0/v;->e:Lz0/k;

    move-object/from16 v23, v1

    const/16 v34, 0x0

    const v35, 0xffc3

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v24, v2

    invoke-direct/range {v16 .. v35}, Lv0/v;-><init>(JJLz0/l;Lz0/j;Lz0/k;Lz0/r;Ljava/lang/String;JLF0/a;LF0/k;LB0/c;JLF0/g;LW/G;I)V

    :goto_37
    new-instance v1, LD0/b;

    const/4 v2, 0x0

    invoke-direct {v1, v7, v2, v4}, LD0/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v8, 0x1

    if-gt v4, v8, :cond_51

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5a

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv0/b;

    iget-object v4, v4, Lv0/b;->a:Ljava/lang/Object;

    check-cast v4, Lv0/v;

    if-nez v3, :cond_50

    goto :goto_38

    :cond_50
    invoke-virtual {v3, v4}, Lv0/v;->c(Lv0/v;)Lv0/v;

    move-result-object v4

    :goto_38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv0/b;

    iget v3, v3, Lv0/b;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/b;

    iget v0, v0, Lv0/b;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v4, v3, v0}, LD0/b;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;

    goto/16 :goto_40

    :cond_51
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x2

    mul-int/lit8 v9, v2, 0x2

    new-array v4, v9, [Ljava/lang/Integer;

    const/4 v8, 0x0

    :goto_39
    if-ge v8, v9, :cond_52

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v4, v8

    const/4 v10, 0x1

    add-int/2addr v8, v10

    goto :goto_39

    :cond_52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v10, 0x0

    :goto_3a
    if-ge v10, v8, :cond_53

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lv0/b;

    iget v13, v11, Lv0/b;->b:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v4, v10

    add-int v13, v10, v2

    iget v11, v11, Lv0/b;->c:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v4, v13

    const/4 v11, 0x1

    add-int/2addr v10, v11

    goto :goto_3a

    :cond_53
    const/4 v11, 0x1

    move-object v2, v4

    check-cast v2, [Ljava/lang/Comparable;

    array-length v8, v2

    if-le v8, v11, :cond_54

    invoke-static {v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    :cond_54
    if-eqz v9, :cond_76

    const/4 v2, 0x0

    aget-object v8, v4, v2

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v8, 0x0

    :goto_3b
    if-ge v8, v9, :cond_5a

    aget-object v10, v4, v8

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-ne v11, v2, :cond_55

    move-object/from16 p3, v0

    move-object/from16 p4, v3

    move-object/from16 v16, v4

    const/4 v0, 0x1

    goto :goto_3f

    :cond_55
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v13

    move-object v15, v3

    const/4 v14, 0x0

    :goto_3c
    if-ge v14, v13, :cond_58

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p3, v0

    move-object/from16 v0, v16

    check-cast v0, Lv0/b;

    move-object/from16 p4, v3

    iget v3, v0, Lv0/b;->b:I

    move-object/from16 v16, v4

    iget v4, v0, Lv0/b;->c:I

    if-eq v3, v4, :cond_57

    invoke-static {v2, v11, v3, v4}, Lv0/d;->b(IIII)Z

    move-result v3

    if-eqz v3, :cond_57

    iget-object v0, v0, Lv0/b;->a:Ljava/lang/Object;

    check-cast v0, Lv0/v;

    if-nez v15, :cond_56

    :goto_3d
    move-object v15, v0

    goto :goto_3e

    :cond_56
    invoke-virtual {v15, v0}, Lv0/v;->c(Lv0/v;)Lv0/v;

    move-result-object v0

    goto :goto_3d

    :cond_57
    :goto_3e
    const/4 v0, 0x1

    add-int/2addr v14, v0

    move-object/from16 v0, p3

    move-object/from16 v3, p4

    move-object/from16 v4, v16

    goto :goto_3c

    :cond_58
    move-object/from16 p3, v0

    move-object/from16 p4, v3

    move-object/from16 v16, v4

    const/4 v0, 0x1

    if-eqz v15, :cond_59

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v15, v2, v10}, LD0/b;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;

    :cond_59
    move v2, v11

    :goto_3f
    add-int/2addr v8, v0

    move-object/from16 v0, p3

    move-object/from16 v3, p4

    move-object/from16 v4, v16

    goto :goto_3b

    :cond_5a
    :goto_40
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v9, 0x0

    :goto_41
    if-ge v9, v0, :cond_6c

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv0/b;

    iget v3, v2, Lv0/b;->b:I

    if-ltz v3, :cond_5b

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v3, v4, :cond_5b

    iget v4, v2, Lv0/b;->c:I

    if-le v4, v3, :cond_5b

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v4, v3, :cond_5c

    :cond_5b
    const/4 v15, 0x0

    goto/16 :goto_49

    :cond_5c
    iget-object v3, v2, Lv0/b;->a:Ljava/lang/Object;

    check-cast v3, Lv0/v;

    iget-object v4, v3, Lv0/v;->i:LF0/a;

    iget v8, v2, Lv0/b;->b:I

    iget v2, v2, Lv0/b;->c:I

    if-eqz v4, :cond_5d

    new-instance v10, Lx0/a;

    iget v4, v4, LF0/a;->a:F

    const/4 v11, 0x0

    invoke-direct {v10, v11, v4}, Lx0/a;-><init>(IF)V

    const/16 v4, 0x21

    invoke-interface {v7, v10, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_5d
    iget-object v4, v3, Lv0/v;->a:LF0/j;

    invoke-interface {v4}, LF0/j;->b()J

    move-result-wide v10

    invoke-static {v7, v10, v11, v8, v2}, Lr2/a;->V(Landroid/text/Spannable;JII)V

    invoke-interface {v4}, LF0/j;->c()LW/D;

    move-result-object v10

    invoke-interface {v4}, LF0/j;->a()F

    move-result v4

    if-eqz v10, :cond_5f

    instance-of v11, v10, LW/J;

    if-eqz v11, :cond_5e

    check-cast v10, LW/J;

    iget-wide v10, v10, LW/J;->e:J

    invoke-static {v7, v10, v11, v8, v2}, Lr2/a;->V(Landroid/text/Spannable;JII)V

    goto :goto_42

    :cond_5e
    new-instance v11, LE0/b;

    check-cast v10, LW/n;

    invoke-direct {v11, v10, v4}, LE0/b;-><init>(LW/n;F)V

    const/16 v4, 0x21

    invoke-interface {v7, v11, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_5f
    :goto_42
    iget-object v4, v3, Lv0/v;->m:LF0/g;

    if-eqz v4, :cond_62

    new-instance v10, Lx0/j;

    iget v4, v4, LF0/g;->a:I

    const/4 v11, 0x1

    or-int/lit8 v13, v4, 0x1

    if-ne v13, v4, :cond_60

    const/4 v11, 0x1

    :goto_43
    const/4 v13, 0x2

    goto :goto_44

    :cond_60
    const/4 v11, 0x0

    goto :goto_43

    :goto_44
    or-int/lit8 v14, v4, 0x2

    if-ne v14, v4, :cond_61

    const/4 v4, 0x1

    goto :goto_45

    :cond_61
    const/4 v4, 0x0

    :goto_45
    invoke-direct {v10, v11, v4}, Lx0/j;-><init>(ZZ)V

    const/16 v4, 0x21

    invoke-interface {v7, v10, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_46

    :cond_62
    const/4 v13, 0x2

    :goto_46
    iget-wide v10, v3, Lv0/v;->b:J

    move-object/from16 v16, v7

    move-wide/from16 v17, v10

    move-object/from16 v19, v6

    move/from16 v20, v8

    move/from16 v21, v2

    invoke-static/range {v16 .. v21}, Lr2/a;->W(Landroid/text/Spannable;JLG0/b;II)V

    iget-object v4, v3, Lv0/v;->g:Ljava/lang/String;

    if-eqz v4, :cond_63

    new-instance v10, Lx0/b;

    const/4 v11, 0x0

    invoke-direct {v10, v11, v4}, Lx0/b;-><init>(ILjava/lang/Object;)V

    const/16 v4, 0x21

    invoke-interface {v7, v10, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_47

    :cond_63
    const/16 v4, 0x21

    :goto_47
    iget-object v10, v3, Lv0/v;->j:LF0/k;

    if-eqz v10, :cond_64

    new-instance v11, Landroid/text/style/ScaleXSpan;

    iget v14, v10, LF0/k;->a:F

    invoke-direct {v11, v14}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    invoke-interface {v7, v11, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    new-instance v11, Lx0/a;

    iget v10, v10, LF0/k;->b:F

    const/4 v14, 0x1

    invoke-direct {v11, v14, v10}, Lx0/a;-><init>(IF)V

    invoke-interface {v7, v11, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_64
    iget-object v10, v3, Lv0/v;->k:LB0/c;

    if-eqz v10, :cond_65

    sget-object v11, LD0/a;->a:LD0/a;

    invoke-virtual {v11, v10}, LD0/a;->a(LB0/c;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v7, v10, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_65
    iget-wide v10, v3, Lv0/v;->l:J

    const-wide/16 v14, 0x10

    cmp-long v4, v10, v14

    if-eqz v4, :cond_66

    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v10, v11}, LW/D;->C(J)I

    move-result v10

    invoke-direct {v4, v10}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    const/16 v10, 0x21

    invoke-interface {v7, v4, v8, v2, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_66
    iget-object v4, v3, Lv0/v;->n:LW/G;

    if-eqz v4, :cond_68

    new-instance v10, Lx0/i;

    iget-wide v14, v4, LW/G;->a:J

    invoke-static {v14, v15}, LW/D;->C(J)I

    move-result v11

    iget-wide v14, v4, LW/G;->b:J

    invoke-static {v14, v15}, LV/c;->b(J)F

    move-result v13

    invoke-static {v14, v15}, LV/c;->c(J)F

    move-result v14

    iget v4, v4, LW/G;->c:F

    const/4 v15, 0x0

    cmpg-float v16, v4, v15

    if-nez v16, :cond_67

    const/4 v4, 0x1

    :cond_67
    invoke-direct {v10, v11, v13, v14, v4}, Lx0/i;-><init>(IFFF)V

    const/16 v4, 0x21

    invoke-interface {v7, v10, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_48

    :cond_68
    const/16 v4, 0x21

    const/4 v15, 0x0

    :goto_48
    iget-object v10, v3, Lv0/v;->o:LY/c;

    if-eqz v10, :cond_69

    new-instance v11, LE0/a;

    invoke-direct {v11, v10}, LE0/a;-><init>(LY/c;)V

    invoke-interface {v7, v11, v8, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_69
    iget-wide v2, v3, Lv0/v;->h:J

    invoke-static {v2, v3}, LG0/h;->b(J)J

    move-result-wide v10

    const-wide v13, 0x100000000L

    invoke-static {v10, v11, v13, v14}, LG0/i;->a(JJ)Z

    move-result v4

    if-nez v4, :cond_6a

    invoke-static {v2, v3}, LG0/h;->b(J)J

    move-result-wide v2

    const-wide v10, 0x200000000L

    invoke-static {v2, v3, v10, v11}, LG0/i;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_6b

    :cond_6a
    const/4 v1, 0x1

    :cond_6b
    :goto_49
    const/4 v2, 0x1

    add-int/2addr v9, v2

    goto/16 :goto_41

    :cond_6c
    if-eqz v1, :cond_72

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    const/4 v9, 0x0

    :goto_4a
    if-ge v9, v0, :cond_72

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv0/b;

    iget v2, v1, Lv0/b;->b:I

    iget-object v3, v1, Lv0/b;->a:Ljava/lang/Object;

    check-cast v3, Lv0/v;

    if-ltz v2, :cond_71

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v2, v4, :cond_71

    iget v1, v1, Lv0/b;->c:I

    if-le v1, v2, :cond_71

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v1, v4, :cond_6d

    const/4 v1, 0x1

    const/16 v3, 0x21

    const-wide v13, 0x200000000L

    goto :goto_4d

    :cond_6d
    iget-wide v3, v3, Lv0/v;->h:J

    invoke-static {v3, v4}, LG0/h;->b(J)J

    move-result-wide v10

    const-wide v13, 0x100000000L

    invoke-static {v10, v11, v13, v14}, LG0/i;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_6e

    new-instance v8, Lx0/f;

    invoke-interface {v6, v3, v4}, LG0/b;->v(J)F

    move-result v3

    invoke-direct {v8, v3}, Lx0/f;-><init>(F)V

    const-wide v13, 0x200000000L

    goto :goto_4b

    :cond_6e
    const-wide v13, 0x200000000L

    invoke-static {v10, v11, v13, v14}, LG0/i;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_6f

    new-instance v8, Lx0/e;

    invoke-static {v3, v4}, LG0/h;->c(J)F

    move-result v3

    invoke-direct {v8, v3}, Lx0/e;-><init>(F)V

    goto :goto_4b

    :cond_6f
    const/4 v8, 0x0

    :goto_4b
    const/16 v3, 0x21

    if-eqz v8, :cond_70

    invoke-interface {v7, v8, v2, v1, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_70
    :goto_4c
    const/4 v1, 0x1

    goto :goto_4d

    :cond_71
    const/16 v3, 0x21

    const-wide v13, 0x200000000L

    goto :goto_4c

    :goto_4d
    add-int/2addr v9, v1

    goto :goto_4a

    :cond_72
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_75

    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv0/b;

    iget-object v2, v1, Lv0/b;->a:Ljava/lang/Object;

    if-nez v2, :cond_74

    iget v2, v1, Lv0/b;->c:I

    const-class v3, Lo1/w;

    iget v1, v1, Lv0/b;->b:I

    invoke-interface {v7, v1, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    array-length v2, v1

    move v10, v0

    :goto_4e
    if-ge v10, v2, :cond_73

    aget-object v0, v1, v10

    check-cast v0, Lo1/w;

    invoke-interface {v7, v0}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    const/4 v0, 0x1

    add-int/2addr v10, v0

    goto :goto_4e

    :cond_73
    new-instance v0, Lx0/h;

    const/4 v0, 0x0

    throw v0

    :cond_74
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_75
    move-object/from16 v1, p0

    :goto_4f
    iput-object v7, v1, LC0/d;->h:Ljava/lang/CharSequence;

    new-instance v0, Lw0/l;

    iget-object v2, v1, LC0/d;->g:LC0/e;

    iget v3, v1, LC0/d;->l:I

    invoke-direct {v0, v7, v2, v3}, Lw0/l;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v0, v1, LC0/d;->i:Lw0/l;

    return-void

    :cond_76
    move-object/from16 v1, p0

    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "Array is empty."

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_77
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid TextDirection."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-object v0, p0, LC0/d;->j:LB0/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LB0/a;->w()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_3

    iget-boolean v0, p0, LC0/d;->k:Z

    if-nez v0, :cond_4

    iget-object v0, p0, LC0/d;->b:Lv0/B;

    iget-object v0, v0, Lv0/B;->c:Lv0/q;

    sget-object v0, LC0/i;->a:LA/t;

    sget-object v0, LC0/i;->a:LA/t;

    iget-object v2, v0, LA/t;->e:Ljava/lang/Object;

    check-cast v2, LD/L0;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lo1/i;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, LA/t;->x()LD/L0;

    move-result-object v2

    iput-object v2, v0, LA/t;->e:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object v2, LC0/j;->a:LC0/k;

    :goto_1
    invoke-interface {v2}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    return v1
.end method

.method public final b()F
    .locals 1

    iget-object v0, p0, LC0/d;->i:Lw0/l;

    invoke-virtual {v0}, Lw0/l;->b()F

    move-result v0

    return v0
.end method

.method public final c()F
    .locals 11

    iget-object v0, p0, LC0/d;->i:Lw0/l;

    iget v1, v0, Lw0/l;->e:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    iget v0, v0, Lw0/l;->e:F

    goto/16 :goto_3

    :cond_0
    iget-object v1, v0, Lw0/l;->b:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object v2

    new-instance v3, Lw0/i;

    iget-object v4, v0, Lw0/l;->a:Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-direct {v3, v5, v4}, Lw0/i;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v3}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    new-instance v3, Ljava/util/PriorityQueue;

    new-instance v5, LD/o;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, LD/o;-><init>(I)V

    const/16 v6, 0xa

    invoke-direct {v3, v6, v5}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    invoke-virtual {v2}, Ljava/text/BreakIterator;->next()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    const/4 v8, -0x1

    if-eq v5, v8, :cond_3

    invoke-virtual {v3}, Ljava/util/PriorityQueue;->size()I

    move-result v8

    if-ge v8, v6, :cond_1

    new-instance v8, Lc2/g;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v8, v7, v9}, Lc2/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v8}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc2/g;

    if-eqz v8, :cond_2

    iget-object v9, v8, Lc2/g;->e:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    iget-object v8, v8, Lc2/g;->d:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    sub-int/2addr v9, v8

    sub-int v8, v5, v7

    if-ge v9, v8, :cond_2

    invoke-virtual {v3}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    new-instance v8, Lc2/g;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v8, v7, v9}, Lc2/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v8}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/text/BreakIterator;->next()I

    move-result v7

    move v10, v7

    move v7, v5

    move v5, v10

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc2/g;

    iget-object v6, v5, Lc2/g;->d:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    iget-object v5, v5, Lc2/g;->e:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v4, v6, v5, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    move-result v3

    goto :goto_2

    :cond_4
    iput v3, v0, Lw0/l;->e:F

    move v0, v3

    :goto_3
    return v0
.end method
