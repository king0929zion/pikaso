.class public final LN/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lq2/a;


# static fields
.field public static final h:LN/l;


# instance fields
.field public final d:J

.field public final e:J

.field public final f:I

.field public final g:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, LN/l;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LN/l;-><init>(JJI[I)V

    sput-object v7, LN/l;->h:LN/l;

    return-void
.end method

.method public constructor <init>(JJI[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LN/l;->d:J

    iput-wide p3, p0, LN/l;->e:J

    iput p5, p0, LN/l;->f:I

    iput-object p6, p0, LN/l;->g:[I

    return-void
.end method


# virtual methods
.method public final a(LN/l;)LN/l;
    .locals 14

    sget-object v0, LN/l;->h:LN/l;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    if-ne p0, v0, :cond_1

    return-object v0

    :cond_1
    iget v0, p1, LN/l;->f:I

    iget-object v1, p1, LN/l;->g:[I

    iget-wide v2, p1, LN/l;->e:J

    iget-wide v4, p1, LN/l;->d:J

    iget v11, p0, LN/l;->f:I

    if-ne v0, v11, :cond_2

    iget-object v12, p0, LN/l;->g:[I

    if-ne v1, v12, :cond_2

    new-instance p1, LN/l;

    iget-wide v0, p0, LN/l;->d:J

    not-long v4, v4

    and-long v7, v0, v4

    iget-wide v0, p0, LN/l;->e:J

    not-long v2, v2

    and-long v9, v0, v2

    move-object v6, p1

    invoke-direct/range {v6 .. v12}, LN/l;-><init>(JJI[I)V

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    if-eqz v1, :cond_3

    array-length v6, v1

    move-object v8, p0

    move v7, v0

    :goto_0
    if-ge v7, v6, :cond_4

    aget v9, v1, v7

    invoke-virtual {v8, v9}, LN/l;->b(I)LN/l;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    move-object v8, p0

    :cond_4
    const-wide/16 v6, 0x0

    cmp-long v1, v2, v6

    const-wide/16 v9, 0x1

    const/16 v11, 0x40

    iget p1, p1, LN/l;->f:I

    if-eqz v1, :cond_6

    move v1, v0

    :goto_1
    if-ge v1, v11, :cond_6

    shl-long v12, v9, v1

    and-long/2addr v12, v2

    cmp-long v12, v12, v6

    if-eqz v12, :cond_5

    add-int v12, v1, p1

    invoke-virtual {v8, v12}, LN/l;->b(I)LN/l;

    move-result-object v8

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    cmp-long v1, v4, v6

    if-eqz v1, :cond_8

    :goto_2
    if-ge v0, v11, :cond_8

    shl-long v1, v9, v0

    and-long/2addr v1, v4

    cmp-long v1, v1, v6

    if-eqz v1, :cond_7

    add-int/lit8 v1, v0, 0x40

    add-int/2addr v1, p1

    invoke-virtual {v8, v1}, LN/l;->b(I)LN/l;

    move-result-object v1

    move-object v8, v1

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    move-object p1, v8

    :goto_3
    return-object p1
.end method

.method public final b(I)LN/l;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v6, v0, LN/l;->f:I

    sub-int v2, v1, v6

    const-wide/16 v3, 0x0

    const-wide/16 v7, 0x1

    const/16 v5, 0x40

    if-ltz v2, :cond_0

    if-ge v2, v5, :cond_0

    shl-long v1, v7, v2

    iget-wide v7, v0, LN/l;->e:J

    and-long v9, v7, v1

    cmp-long v3, v9, v3

    if-eqz v3, :cond_5

    new-instance v9, LN/l;

    not-long v1, v1

    and-long v4, v7, v1

    iget-object v7, v0, LN/l;->g:[I

    iget-wide v2, v0, LN/l;->d:J

    move-object v1, v9

    invoke-direct/range {v1 .. v7}, LN/l;-><init>(JJI[I)V

    return-object v9

    :cond_0
    if-lt v2, v5, :cond_1

    const/16 v9, 0x80

    if-ge v2, v9, :cond_1

    sub-int/2addr v2, v5

    shl-long v1, v7, v2

    iget-wide v7, v0, LN/l;->d:J

    and-long v9, v7, v1

    cmp-long v3, v9, v3

    if-eqz v3, :cond_5

    new-instance v9, LN/l;

    not-long v1, v1

    and-long v2, v7, v1

    iget-wide v4, v0, LN/l;->e:J

    iget-object v7, v0, LN/l;->g:[I

    move-object v1, v9

    invoke-direct/range {v1 .. v7}, LN/l;-><init>(JJI[I)V

    return-object v9

    :cond_1
    if-gez v2, :cond_5

    iget-object v2, v0, LN/l;->g:[I

    if-eqz v2, :cond_5

    invoke-static {v2, v1}, LN/t;->b([II)I

    move-result v1

    if-ltz v1, :cond_5

    array-length v3, v2

    add-int/lit8 v4, v3, -0x1

    if-nez v4, :cond_2

    new-instance v1, LN/l;

    iget-wide v6, v0, LN/l;->d:J

    iget-wide v8, v0, LN/l;->e:J

    iget v10, v0, LN/l;->f:I

    const/4 v11, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LN/l;-><init>(JJI[I)V

    return-object v1

    :cond_2
    new-array v5, v4, [I

    if-lez v1, :cond_3

    const/4 v6, 0x0

    invoke-static {v6, v6, v1, v2, v5}, Ld2/j;->X(III[I[I)V

    :cond_3
    if-ge v1, v4, :cond_4

    add-int/lit8 v4, v1, 0x1

    invoke-static {v1, v4, v3, v2, v5}, Ld2/j;->X(III[I[I)V

    :cond_4
    new-instance v1, LN/l;

    iget v2, v0, LN/l;->f:I

    iget-wide v13, v0, LN/l;->d:J

    iget-wide v3, v0, LN/l;->e:J

    move-object v12, v1

    move-wide v15, v3

    move/from16 v17, v2

    move-object/from16 v18, v5

    invoke-direct/range {v12 .. v18}, LN/l;-><init>(JJI[I)V

    return-object v1

    :cond_5
    return-object v0
.end method

.method public final c(I)Z
    .locals 10

    iget v0, p0, LN/l;->f:I

    sub-int v0, p1, v0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x1

    const/4 v5, 0x1

    const/16 v6, 0x40

    const/4 v7, 0x0

    if-ltz v0, :cond_1

    if-ge v0, v6, :cond_1

    shl-long/2addr v3, v0

    iget-wide v8, p0, LN/l;->e:J

    and-long/2addr v3, v8

    cmp-long p1, v3, v1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v5, v7

    :goto_0
    return v5

    :cond_1
    if-lt v0, v6, :cond_3

    const/16 v8, 0x80

    if-ge v0, v8, :cond_3

    sub-int/2addr v0, v6

    shl-long/2addr v3, v0

    iget-wide v8, p0, LN/l;->d:J

    and-long/2addr v3, v8

    cmp-long p1, v3, v1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v5, v7

    :goto_1
    return v5

    :cond_3
    if-lez v0, :cond_4

    return v7

    :cond_4
    iget-object v0, p0, LN/l;->g:[I

    if-eqz v0, :cond_6

    invoke-static {v0, p1}, LN/t;->b([II)I

    move-result p1

    if-ltz p1, :cond_5

    goto :goto_2

    :cond_5
    move v5, v7

    :goto_2
    move v7, v5

    :cond_6
    return v7
.end method

.method public final d(LN/l;)LN/l;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, LN/l;->h:LN/l;

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    if-ne v0, v2, :cond_1

    return-object v1

    :cond_1
    iget v2, v1, LN/l;->f:I

    iget-wide v3, v0, LN/l;->e:J

    iget-wide v5, v0, LN/l;->d:J

    iget-object v7, v1, LN/l;->g:[I

    iget-wide v8, v1, LN/l;->e:J

    iget-wide v10, v1, LN/l;->d:J

    iget v15, v0, LN/l;->f:I

    if-ne v2, v15, :cond_2

    iget-object v2, v0, LN/l;->g:[I

    if-ne v7, v2, :cond_2

    new-instance v1, LN/l;

    or-long v13, v5, v10

    or-long/2addr v3, v8

    move-object v12, v1

    move v5, v15

    move-wide v15, v3

    move/from16 v17, v5

    move-object/from16 v18, v2

    invoke-direct/range {v12 .. v18}, LN/l;-><init>(JJI[I)V

    goto/16 :goto_6

    :cond_2
    const-wide/16 v12, 0x1

    const/16 v2, 0x40

    const-wide/16 v15, 0x0

    iget-object v14, v0, LN/l;->g:[I

    if-nez v14, :cond_7

    if-eqz v14, :cond_3

    array-length v7, v14

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_3

    aget v9, v14, v8

    invoke-virtual {v1, v9}, LN/l;->e(I)LN/l;

    move-result-object v1

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    cmp-long v7, v3, v15

    iget v8, v0, LN/l;->f:I

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v2, :cond_5

    shl-long v9, v12, v7

    and-long/2addr v9, v3

    cmp-long v9, v9, v15

    if-eqz v9, :cond_4

    add-int v9, v7, v8

    invoke-virtual {v1, v9}, LN/l;->e(I)LN/l;

    move-result-object v1

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    cmp-long v3, v5, v15

    if-eqz v3, :cond_e

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v2, :cond_e

    shl-long v3, v12, v14

    and-long/2addr v3, v5

    cmp-long v3, v3, v15

    if-eqz v3, :cond_6

    add-int/lit8 v3, v14, 0x40

    add-int/2addr v3, v8

    invoke-virtual {v1, v3}, LN/l;->e(I)LN/l;

    move-result-object v1

    :cond_6
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_7
    if-eqz v7, :cond_8

    array-length v3, v7

    move-object v5, v0

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_9

    aget v6, v7, v4

    invoke-virtual {v5, v6}, LN/l;->e(I)LN/l;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    move-object v5, v0

    :cond_9
    cmp-long v3, v8, v15

    iget v1, v1, LN/l;->f:I

    if-eqz v3, :cond_b

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_b

    shl-long v6, v12, v3

    and-long/2addr v6, v8

    cmp-long v4, v6, v15

    if-eqz v4, :cond_a

    add-int v4, v3, v1

    invoke-virtual {v5, v4}, LN/l;->e(I)LN/l;

    move-result-object v4

    move-object v5, v4

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_b
    cmp-long v3, v10, v15

    if-eqz v3, :cond_d

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v2, :cond_d

    shl-long v3, v12, v14

    and-long/2addr v3, v10

    cmp-long v3, v3, v15

    if-eqz v3, :cond_c

    add-int/lit8 v3, v14, 0x40

    add-int/2addr v3, v1

    invoke-virtual {v5, v3}, LN/l;->e(I)LN/l;

    move-result-object v3

    move-object v5, v3

    :cond_c
    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    :cond_d
    move-object v1, v5

    :cond_e
    :goto_6
    return-object v1
.end method

.method public final e(I)LN/l;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v6, v0, LN/l;->f:I

    sub-int v2, v1, v6

    iget-wide v4, v0, LN/l;->e:J

    const-wide/16 v7, 0x1

    const-wide/16 v9, 0x0

    const/16 v3, 0x40

    if-ltz v2, :cond_0

    if-ge v2, v3, :cond_0

    shl-long v1, v7, v2

    and-long v7, v4, v1

    cmp-long v3, v7, v9

    if-nez v3, :cond_a

    new-instance v8, LN/l;

    or-long/2addr v4, v1

    iget-object v7, v0, LN/l;->g:[I

    iget-wide v2, v0, LN/l;->d:J

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LN/l;-><init>(JJI[I)V

    return-object v8

    :cond_0
    iget-wide v11, v0, LN/l;->d:J

    const/16 v13, 0x80

    if-lt v2, v3, :cond_1

    if-ge v2, v13, :cond_1

    sub-int/2addr v2, v3

    shl-long v1, v7, v2

    and-long v7, v11, v1

    cmp-long v3, v7, v9

    if-nez v3, :cond_a

    new-instance v8, LN/l;

    or-long v2, v11, v1

    iget-object v7, v0, LN/l;->g:[I

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LN/l;-><init>(JJI[I)V

    return-object v8

    :cond_1
    iget-object v14, v0, LN/l;->g:[I

    if-lt v2, v13, :cond_8

    invoke-virtual/range {p0 .. p1}, LN/l;->c(I)Z

    move-result v2

    if-nez v2, :cond_a

    add-int/lit8 v2, v1, 0x1

    div-int/2addr v2, v3

    mul-int/2addr v2, v3

    iget v6, v0, LN/l;->f:I

    const/4 v13, 0x0

    move-wide/from16 v17, v11

    :goto_0
    if-ge v6, v2, :cond_6

    cmp-long v11, v4, v9

    if-eqz v11, :cond_4

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    if-eqz v14, :cond_2

    array-length v11, v14

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_2

    aget v16, v14, v12

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    :goto_2
    if-ge v11, v3, :cond_4

    shl-long v15, v7, v11

    and-long/2addr v15, v4

    cmp-long v12, v15, v9

    if-eqz v12, :cond_3

    add-int v12, v11, v6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v13, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    cmp-long v4, v17, v9

    if-nez v4, :cond_5

    move/from16 v21, v2

    move-wide v4, v9

    goto :goto_3

    :cond_5
    add-int/lit8 v6, v6, 0x40

    move-wide/from16 v4, v17

    move-wide/from16 v17, v9

    goto :goto_0

    :cond_6
    move/from16 v21, v6

    :goto_3
    new-instance v2, LN/l;

    if-eqz v13, :cond_7

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v3

    new-array v14, v3, [I

    invoke-interface {v13}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v15, 0x0

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    add-int/lit8 v7, v15, 0x1

    aput v6, v14, v15

    move v15, v7

    goto :goto_4

    :cond_7
    move-object/from16 v22, v14

    move-object/from16 v16, v2

    move-wide/from16 v19, v4

    invoke-direct/range {v16 .. v22}, LN/l;-><init>(JJI[I)V

    invoke-virtual {v2, v1}, LN/l;->e(I)LN/l;

    move-result-object v1

    return-object v1

    :cond_8
    if-nez v14, :cond_9

    new-instance v8, LN/l;

    filled-new-array/range {p1 .. p1}, [I

    move-result-object v7

    move-object v1, v8

    move-wide v2, v11

    invoke-direct/range {v1 .. v7}, LN/l;-><init>(JJI[I)V

    return-object v8

    :cond_9
    invoke-static {v14, v1}, LN/t;->b([II)I

    move-result v2

    if-gez v2, :cond_a

    add-int/lit8 v2, v2, 0x1

    neg-int v2, v2

    array-length v3, v14

    add-int/lit8 v4, v3, 0x1

    new-array v11, v4, [I

    const/4 v4, 0x0

    invoke-static {v4, v4, v2, v14, v11}, Ld2/j;->X(III[I[I)V

    add-int/lit8 v4, v2, 0x1

    invoke-static {v4, v2, v3, v14, v11}, Ld2/j;->X(III[I[I)V

    aput v1, v11, v2

    new-instance v1, LN/l;

    iget v10, v0, LN/l;->f:I

    iget-wide v6, v0, LN/l;->d:J

    iget-wide v8, v0, LN/l;->e:J

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LN/l;-><init>(JJI[I)V

    return-object v1

    :cond_a
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LN/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LN/k;-><init>(LN/l;Lg2/d;)V

    invoke-static {v0}, LZ0/d;->D(Lo2/e;)Lw2/g;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0}, Ld2/m;->W(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, LN/l;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    move-object v3, v2

    check-cast v3, Lw2/g;

    invoke-virtual {v3}, Lw2/g;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lw2/g;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x1

    add-int/2addr v6, v8

    if-le v6, v8, :cond_1

    const-string v9, ", "

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    instance-of v8, v7, Ljava/lang/CharSequence;

    :goto_2
    if-eqz v8, :cond_3

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_3

    :cond_3
    instance-of v8, v7, Ljava/lang/Character;

    if-eqz v8, :cond_4

    check-cast v7, Ljava/lang/Character;

    invoke-virtual {v7}, Ljava/lang/Character;->charValue()C

    move-result v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    goto :goto_3

    :cond_4
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
