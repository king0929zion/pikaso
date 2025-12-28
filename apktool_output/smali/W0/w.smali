.class public final Lw0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LC0/e;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Landroid/text/Layout;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:F

.field public final j:F

.field public final k:Z

.field public final l:Landroid/graphics/Paint$FontMetricsInt;

.field public final m:I

.field public final n:[Lx0/g;

.field public final o:Landroid/graphics/Rect;

.field public p:La1/c;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;FLC0/e;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILw0/l;)V
    .locals 39

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    move/from16 v3, p4

    move/from16 v15, p7

    move/from16 v14, p8

    const/4 v13, 0x1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v6, p3

    iput-object v6, v1, Lw0/w;->a:LC0/e;

    iput-boolean v15, v1, Lw0/w;->b:Z

    const/4 v12, 0x1

    iput-boolean v12, v1, Lw0/w;->c:Z

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, v1, Lw0/w;->o:Landroid/graphics/Rect;

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-static/range {p6 .. p6}, Lw0/x;->a(I)Landroid/text/TextDirectionHeuristic;

    move-result-object v36

    sget-object v5, Lw0/u;->a:Landroid/text/Layout$Alignment;

    if-eqz v3, :cond_4

    if-eq v3, v13, :cond_3

    const/4 v5, 0x2

    if-eq v3, v5, :cond_2

    const/4 v5, 0x3

    if-eq v3, v5, :cond_1

    const/4 v5, 0x4

    if-eq v3, v5, :cond_0

    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    sget-object v3, Lw0/u;->b:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_1
    sget-object v3, Lw0/u;->a:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_2
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_3
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    :cond_4
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_0

    :goto_1
    instance-of v3, v0, Landroid/text/Spanned;

    if-eqz v3, :cond_5

    move-object v3, v0

    check-cast v3, Landroid/text/Spanned;

    const/4 v5, -0x1

    const-class v7, Lx0/a;

    invoke-interface {v3, v5, v4, v7}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v3

    if-ge v3, v4, :cond_5

    move v3, v13

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    const-string v4, "TextLayout:initLayout"

    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual/range {p14 .. p14}, Lw0/l;->a()Landroid/text/BoringLayout$Metrics;

    move-result-object v8

    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    double-to-float v7, v11

    float-to-int v12, v7

    sget-object v11, Lw0/r;->a:Lw0/n;

    const/16 v10, 0x21

    if-eqz v8, :cond_9

    :try_start_1
    invoke-virtual/range {p14 .. p14}, Lw0/l;->b()F

    move-result v7

    cmpg-float v2, v7, v2

    if-gtz v2, :cond_9

    if-nez v3, :cond_9

    iput-boolean v13, v1, Lw0/w;->k:Z

    if-ltz v12, :cond_8

    if-ltz v12, :cond_7

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v10, :cond_6

    const/high16 v7, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move v4, v12

    move-object v5, v9

    move v6, v7

    move/from16 v7, v17

    move/from16 v9, p7

    const/16 v16, 0x1

    move/from16 v10, v16

    move-object/from16 v37, v11

    const/4 v14, 0x0

    move-object/from16 v11, p5

    move/from16 v24, v16

    invoke-static/range {v2 .. v12}, Lw0/a;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    move-result-object v2

    goto :goto_3

    :cond_6
    move-object/from16 v37, v11

    const/4 v14, 0x0

    const/16 v24, 0x1

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move v4, v12

    move-object v5, v9

    move v6, v7

    move v7, v10

    move/from16 v9, p7

    move-object/from16 v10, p5

    move v11, v12

    invoke-static/range {v2 .. v11}, Lw0/b;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    move-result-object v2

    :goto_3
    move-object v3, v2

    move-object/from16 v2, v37

    goto/16 :goto_4

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "negative ellipsized width"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "negative width"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    goto/16 :goto_15

    :cond_9
    move-object/from16 v37, v11

    const/4 v14, 0x0

    const/16 v24, 0x1

    iput-boolean v14, v1, Lw0/w;->k:Z

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v11, v2

    new-instance v10, Lw0/t;

    const/16 v23, 0x0

    const/16 v22, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    move v8, v13

    move v13, v2

    const/4 v2, 0x0

    move/from16 v5, p8

    move v3, v14

    move v14, v2

    const/4 v4, 0x0

    move-object v2, v10

    move-object/from16 v3, p1

    move v5, v7

    move-object/from16 v6, p3

    move v7, v12

    move v12, v8

    move-object/from16 v8, v36

    move-object/from16 v38, v10

    move/from16 v10, p8

    move/from16 v16, v11

    move-object/from16 v11, p5

    move/from16 v12, v16

    move/from16 v15, p13

    move/from16 v16, p7

    move/from16 v17, v24

    move/from16 v18, p9

    move/from16 v19, p10

    move/from16 v20, p11

    move/from16 v21, p12

    invoke-direct/range {v2 .. v23}, Lw0/t;-><init>(Ljava/lang/CharSequence;IILC0/e;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V

    move-object/from16 v2, v37

    move-object/from16 v3, v38

    invoke-interface {v2, v3}, Lw0/s;->a(Lw0/t;)Landroid/text/StaticLayout;

    move-result-object v3

    :goto_4
    iput-object v3, v1, Lw0/w;->e:Landroid/text/Layout;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-virtual {v3}, Landroid/text/Layout;->getLineCount()I

    move-result v4

    move/from16 v5, p8

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    iput v4, v1, Lw0/w;->f:I

    const/4 v6, 0x1

    add-int/lit8 v7, v4, -0x1

    if-ge v4, v5, :cond_b

    :cond_a
    const/4 v13, 0x0

    goto :goto_5

    :cond_b
    invoke-virtual {v3, v7}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v5

    if-gtz v5, :cond_c

    invoke-virtual {v3, v7}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eq v5, v0, :cond_a

    :cond_c
    move v13, v6

    :goto_5
    iput-boolean v13, v1, Lw0/w;->d:Z

    sget-wide v8, Lw0/x;->b:J

    const-wide v10, 0xffffffffL

    const/16 v0, 0x20

    if-nez p7, :cond_16

    iget-boolean v5, v1, Lw0/w;->k:Z

    if-eqz v5, :cond_e

    move-object v5, v3

    check-cast v5, Landroid/text/BoringLayout;

    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0x21

    if-lt v12, v13, :cond_d

    invoke-static {v5}, Lw0/a;->c(Landroid/text/BoringLayout;)Z

    move-result v5

    goto :goto_7

    :cond_d
    const/4 v5, 0x0

    goto :goto_7

    :cond_e
    const/16 v13, 0x21

    move-object v5, v3

    check-cast v5, Landroid/text/StaticLayout;

    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v12, v13, :cond_f

    invoke-static {v5}, Lw0/q;->a(Landroid/text/StaticLayout;)Z

    move-result v12

    goto :goto_6

    :cond_f
    const/16 v5, 0x1c

    if-lt v12, v5, :cond_10

    move/from16 v12, v24

    goto :goto_6

    :cond_10
    const/4 v12, 0x0

    :goto_6
    move v5, v12

    :goto_7
    if-eqz v5, :cond_11

    goto :goto_b

    :cond_11
    invoke-virtual {v3}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Landroid/text/Layout;->getLineStart(I)I

    move-result v14

    invoke-virtual {v3, v15}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v13

    invoke-static {v5, v12, v14, v13}, Lw0/r;->a(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    move-result-object v13

    invoke-virtual {v3, v15}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v14

    iget v15, v13, Landroid/graphics/Rect;->top:I

    if-ge v15, v14, :cond_12

    sub-int/2addr v14, v15

    goto :goto_8

    :cond_12
    invoke-virtual {v3}, Landroid/text/Layout;->getTopPadding()I

    move-result v14

    :goto_8
    if-ne v4, v6, :cond_13

    goto :goto_9

    :cond_13
    invoke-virtual {v3, v7}, Landroid/text/Layout;->getLineStart(I)I

    move-result v4

    invoke-virtual {v3, v7}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v13

    invoke-static {v5, v12, v4, v13}, Lw0/r;->a(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    move-result-object v13

    :goto_9
    invoke-virtual {v3, v7}, Landroid/text/Layout;->getLineDescent(I)I

    move-result v4

    iget v5, v13, Landroid/graphics/Rect;->bottom:I

    if-le v5, v4, :cond_14

    sub-int/2addr v5, v4

    goto :goto_a

    :cond_14
    invoke-virtual {v3}, Landroid/text/Layout;->getBottomPadding()I

    move-result v5

    :goto_a
    if-nez v14, :cond_15

    if-nez v5, :cond_15

    goto :goto_b

    :cond_15
    int-to-long v12, v14

    shl-long/2addr v12, v0

    int-to-long v4, v5

    and-long/2addr v4, v10

    or-long/2addr v4, v12

    goto :goto_c

    :cond_16
    :goto_b
    move-wide v4, v8

    :goto_c
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    instance-of v12, v12, Landroid/text/Spanned;

    if-nez v12, :cond_17

    :goto_d
    const/4 v3, 0x0

    goto :goto_e

    :cond_17
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    const-string v14, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v12, v14}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroid/text/Spanned;

    const-class v15, Lx0/g;

    invoke-static {v12, v15}, Lw0/r;->b(Landroid/text/Spanned;Ljava/lang/Class;)Z

    move-result v12

    if-nez v12, :cond_18

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-lez v12, :cond_18

    goto :goto_d

    :cond_18
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v12

    invoke-static {v12, v14}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroid/text/Spanned;

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v14, 0x0

    invoke-interface {v12, v14, v3, v15}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lx0/g;

    :goto_e
    iput-object v3, v1, Lw0/w;->n:[Lx0/g;

    if-eqz v3, :cond_1d

    array-length v8, v3

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_f
    if-ge v9, v8, :cond_1b

    aget-object v15, v3, v9

    iget v13, v15, Lx0/g;->j:I

    if-gez v13, :cond_19

    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    move-result v13

    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v12

    :cond_19
    iget v13, v15, Lx0/g;->k:I

    if-gez v13, :cond_1a

    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    move-result v13

    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    move v14, v13

    :cond_1a
    add-int/2addr v9, v6

    goto :goto_f

    :cond_1b
    if-nez v12, :cond_1c

    if-nez v14, :cond_1c

    sget-wide v8, Lw0/x;->b:J

    goto :goto_10

    :cond_1c
    int-to-long v8, v12

    shl-long/2addr v8, v0

    int-to-long v12, v14

    and-long/2addr v12, v10

    or-long/2addr v8, v12

    :cond_1d
    :goto_10
    shr-long v12, v4, v0

    long-to-int v3, v12

    shr-long v12, v8, v0

    long-to-int v0, v12

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v1, Lw0/w;->g:I

    and-long v3, v4, v10

    long-to-int v0, v3

    and-long v3, v8, v10

    long-to-int v3, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v1, Lw0/w;->h:I

    iget-object v0, v1, Lw0/w;->a:LC0/e;

    iget-object v3, v1, Lw0/w;->n:[Lx0/g;

    iget v4, v1, Lw0/w;->f:I

    sub-int/2addr v4, v6

    iget-object v5, v1, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v5, v4}, Landroid/text/Layout;->getLineStart(I)I

    move-result v6

    invoke-virtual {v5, v4}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    if-ne v6, v5, :cond_21

    if-eqz v3, :cond_21

    array-length v5, v3

    if-nez v5, :cond_1e

    goto/16 :goto_12

    :cond_1e
    new-instance v15, Landroid/text/SpannableString;

    const-string v5, "\u200b"

    invoke-direct {v15, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    array-length v5, v3

    if-eqz v5, :cond_20

    const/4 v5, 0x0

    aget-object v3, v3, v5

    invoke-virtual {v15}, Landroid/text/SpannableString;->length()I

    move-result v5

    if-eqz v4, :cond_1f

    iget-boolean v4, v3, Lx0/g;->d:Z

    if-eqz v4, :cond_1f

    const/4 v11, 0x0

    goto :goto_11

    :cond_1f
    iget-boolean v11, v3, Lx0/g;->d:Z

    :goto_11
    new-instance v4, Lx0/g;

    iget-boolean v6, v3, Lx0/g;->d:Z

    iget v8, v3, Lx0/g;->e:F

    iget v3, v3, Lx0/g;->a:F

    move-object/from16 p5, v4

    move/from16 p6, v3

    move/from16 p7, v5

    move/from16 p8, v11

    move/from16 p9, v6

    move/from16 p10, v8

    invoke-direct/range {p5 .. p10}, Lx0/g;-><init>(FIZZF)V

    invoke-virtual {v15}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/4 v5, 0x0

    const/16 v6, 0x21

    invoke-virtual {v15, v4, v5, v3, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v15}, Landroid/text/SpannableString;->length()I

    move-result v17

    sget-object v21, Lw0/j;->a:Landroid/text/Layout$Alignment;

    new-instance v3, Lw0/t;

    move-object v14, v3

    iget-boolean v4, v1, Lw0/w;->b:Z

    move/from16 v28, v4

    iget-boolean v4, v1, Lw0/w;->c:Z

    move/from16 v29, v4

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v16, 0x0

    const v19, 0x7fffffff

    const v22, 0x7fffffff

    const/16 v23, 0x0

    const v24, 0x7fffffff

    const/high16 v25, 0x3f800000    # 1.0f

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move v4, v5

    move-object/from16 v18, v0

    move-object/from16 v20, v36

    invoke-direct/range {v14 .. v35}, Lw0/t;-><init>(Ljava/lang/CharSequence;IILC0/e;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V

    invoke-interface {v2, v3}, Lw0/s;->a(Lw0/t;)Landroid/text/StaticLayout;

    move-result-object v0

    new-instance v13, Landroid/graphics/Paint$FontMetricsInt;

    invoke-direct {v13}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    invoke-virtual {v0, v4}, Landroid/text/Layout;->getLineAscent(I)I

    move-result v2

    iput v2, v13, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    invoke-virtual {v0, v4}, Landroid/text/StaticLayout;->getLineDescent(I)I

    move-result v2

    iput v2, v13, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    invoke-virtual {v0, v4}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v2

    iput v2, v13, Landroid/graphics/Paint$FontMetricsInt;->top:I

    invoke-virtual {v0, v4}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v0

    iput v0, v13, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto :goto_13

    :cond_20
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "Array is empty."

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    :goto_12
    const/4 v4, 0x0

    const/4 v13, 0x0

    :goto_13
    if-eqz v13, :cond_22

    iget v0, v13, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    invoke-virtual {v1, v7}, Lw0/w;->d(I)F

    move-result v2

    invoke-virtual {v1, v7}, Lw0/w;->f(I)F

    move-result v3

    sub-float/2addr v2, v3

    float-to-int v2, v2

    sub-int v11, v0, v2

    goto :goto_14

    :cond_22
    move v11, v4

    :goto_14
    iput v11, v1, Lw0/w;->m:I

    iput-object v13, v1, Lw0/w;->l:Landroid/graphics/Paint$FontMetricsInt;

    iget-object v0, v1, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v0, v7, v2}, Lx/c;->e(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result v0

    iput v0, v1, Lw0/w;->i:F

    iget-object v0, v1, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-static {v0, v7, v2}, Lx/c;->f(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    move-result v0

    iput v0, v1, Lw0/w;->j:F

    return-void

    :goto_15
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget-boolean v0, p0, Lw0/w;->d:Z

    iget-object v1, p0, Lw0/w;->e:Landroid/text/Layout;

    if-eqz v0, :cond_0

    iget v0, p0, Lw0/w;->f:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    move-result v0

    :goto_0
    iget v1, p0, Lw0/w;->g:I

    add-int/2addr v0, v1

    iget v1, p0, Lw0/w;->h:I

    add-int/2addr v0, v1

    iget v1, p0, Lw0/w;->m:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final b()La1/c;
    .locals 2

    iget-object v0, p0, Lw0/w;->p:La1/c;

    if-nez v0, :cond_0

    new-instance v0, La1/c;

    iget-object v1, p0, Lw0/w;->e:Landroid/text/Layout;

    invoke-direct {v0, v1}, La1/c;-><init>(Landroid/text/Layout;)V

    iput-object v0, p0, Lw0/w;->p:La1/c;

    return-object v0

    :cond_0
    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final c(I)F
    .locals 2

    iget v0, p0, Lw0/w;->g:I

    int-to-float v0, v0

    iget v1, p0, Lw0/w;->f:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lw0/w;->l:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lw0/w;->f(I)F

    move-result p1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    int-to-float v1, v1

    sub-float/2addr p1, v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result p1

    int-to-float p1, p1

    :goto_0
    add-float/2addr v0, p1

    return v0
.end method

.method public final d(I)F
    .locals 3

    iget v0, p0, Lw0/w;->f:I

    add-int/lit8 v1, v0, -0x1

    iget-object v2, p0, Lw0/w;->e:Landroid/text/Layout;

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lw0/w;->l:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v1, :cond_0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result p1

    int-to-float p1, p1

    iget v0, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    int-to-float v0, v0

    add-float/2addr p1, v0

    return p1

    :cond_0
    iget v1, p0, Lw0/w;->g:I

    int-to-float v1, v1

    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lw0/w;->h:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    int-to-float p1, p1

    add-float/2addr v1, p1

    return v1
.end method

.method public final e(I)I
    .locals 2

    iget-object v0, p0, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final f(I)F
    .locals 1

    iget-object v0, p0, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    move-result v0

    int-to-float v0, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p0, Lw0/w;->g:I

    :goto_0
    int-to-float p1, p1

    add-float/2addr v0, p1

    return v0
.end method

.method public final g(IZ)F
    .locals 2

    invoke-virtual {p0}, Lw0/w;->b()La1/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, La1/c;->d(IZZ)F

    move-result p2

    iget-object v0, p0, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    iget v0, p0, Lw0/w;->f:I

    sub-int/2addr v0, v1

    if-ne p1, v0, :cond_0

    iget p1, p0, Lw0/w;->i:F

    iget v0, p0, Lw0/w;->j:F

    add-float/2addr p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-float/2addr p1, p2

    return p1
.end method

.method public final h(IZ)F
    .locals 2

    invoke-virtual {p0}, Lw0/w;->b()La1/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, La1/c;->d(IZZ)F

    move-result p2

    iget-object v0, p0, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    iget v0, p0, Lw0/w;->f:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    iget p1, p0, Lw0/w;->i:F

    iget v0, p0, Lw0/w;->j:F

    add-float/2addr p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-float/2addr p1, p2

    return p1
.end method
