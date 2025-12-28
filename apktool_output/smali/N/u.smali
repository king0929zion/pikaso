.class public final LN/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo2/c;

.field public b:Ln0/f0;

.field public c:Ln/w;

.field public d:I

.field public final e:LA/t;

.field public final f:Ln/y;

.field public final g:Ln/B;

.field public final h:LF/d;

.field public final i:LD/m;

.field public j:I

.field public final k:LA/t;

.field public final l:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lo2/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/u;->a:Lo2/c;

    const/4 p1, -0x1

    iput p1, p0, LN/u;->d:I

    new-instance p1, LA/t;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, LA/t;-><init>(I)V

    iput-object p1, p0, LN/u;->e:LA/t;

    new-instance p1, Ln/y;

    invoke-direct {p1}, Ln/y;-><init>()V

    iput-object p1, p0, LN/u;->f:Ln/y;

    new-instance p1, Ln/B;

    invoke-direct {p1}, Ln/B;-><init>()V

    iput-object p1, p0, LN/u;->g:Ln/B;

    new-instance p1, LF/d;

    const/16 v0, 0x10

    new-array v0, v0, [LD/D;

    invoke-direct {p1, v0}, LF/d;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, LN/u;->h:LF/d;

    new-instance p1, LD/m;

    const/4 v0, 0x1

    invoke-direct {p1, v0, p0}, LD/m;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, LN/u;->i:LD/m;

    new-instance p1, LA/t;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, LA/t;-><init>(I)V

    iput-object p1, p0, LN/u;->k:LA/t;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LN/u;->l:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Ln0/f0;LD/y;Lo2/a;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, LN/u;->b:Ln0/f0;

    iget-object v3, v1, LN/u;->c:Ln/w;

    iget v4, v1, LN/u;->d:I

    iput-object v0, v1, LN/u;->b:Ln0/f0;

    iget-object v5, v1, LN/u;->f:Ln/y;

    invoke-virtual {v5, v0}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln/w;

    iput-object v0, v1, LN/u;->c:Ln/w;

    iget v0, v1, LN/u;->d:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_0

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->d()I

    move-result v0

    iput v0, v1, LN/u;->d:I

    :cond_0
    iget-object v0, v1, LN/u;->i:LD/m;

    invoke-static {}, LD/d;->v()LF/d;

    move-result-object v5

    const/4 v6, 0x1

    :try_start_0
    invoke-virtual {v5, v0}, LF/d;->b(Ljava/lang/Object;)V

    invoke-static/range {p2 .. p3}, LN/t;->c(Lo2/c;Lo2/a;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v0, v5, LF/d;->f:I

    sub-int/2addr v0, v6

    invoke-virtual {v5, v0}, LF/d;->m(I)Ljava/lang/Object;

    iget-object v0, v1, LN/u;->b:Ln0/f0;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    iget v5, v1, LN/u;->d:I

    iget-object v7, v1, LN/u;->c:Ln/w;

    if-eqz v7, :cond_7

    iget-object v8, v7, Ln/w;->a:[J

    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    if-ltz v9, :cond_7

    const/4 v11, 0x0

    :goto_0
    aget-wide v12, v8, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_6

    sub-int v14, v11, v9

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v14, :cond_5

    const-wide/16 v16, 0xff

    and-long v16, v12, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_4

    shl-int/lit8 v16, v11, 0x3

    add-int v6, v16, v10

    iget-object v15, v7, Ln/w;->b:[Ljava/lang/Object;

    aget-object v15, v15, v6

    move-object/from16 v16, v8

    iget-object v8, v7, Ln/w;->c:[I

    aget v8, v8, v6

    if-eq v8, v5, :cond_1

    const/4 v8, 0x1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_2

    invoke-virtual {v1, v0, v15}, LN/u;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    if-eqz v8, :cond_3

    invoke-virtual {v7, v6}, Ln/w;->e(I)V

    :cond_3
    const/16 v6, 0x8

    goto :goto_3

    :cond_4
    move-object/from16 v16, v8

    move v6, v15

    :goto_3
    shr-long/2addr v12, v6

    add-int/lit8 v10, v10, 0x1

    move v15, v6

    move-object/from16 v8, v16

    const/4 v6, 0x1

    goto :goto_1

    :cond_5
    move-object/from16 v16, v8

    move v6, v15

    if-ne v14, v6, :cond_7

    goto :goto_4

    :cond_6
    move-object/from16 v16, v8

    :goto_4
    if-eq v11, v9, :cond_7

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v8, v16

    const/4 v6, 0x1

    goto :goto_0

    :cond_7
    iput-object v2, v1, LN/u;->b:Ln0/f0;

    iput-object v3, v1, LN/u;->c:Ln/w;

    iput v4, v1, LN/u;->d:I

    return-void

    :catchall_0
    move-exception v0

    iget v2, v5, LF/d;->f:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {v5, v2}, LF/d;->m(I)Ljava/lang/Object;

    throw v0
.end method

.method public final b(Ljava/util/Set;)Z
    .locals 43

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LN/u;->l:Ljava/util/HashMap;

    instance-of v3, v1, LF/f;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"

    iget-object v5, v0, LN/u;->h:LF/d;

    const/4 v10, 0x7

    const/4 v11, 0x2

    const/16 v16, 0x0

    iget-object v15, v0, LN/u;->k:LA/t;

    iget-object v6, v0, LN/u;->e:LA/t;

    iget-object v7, v0, LN/u;->g:Ln/B;

    if-eqz v3, :cond_20

    check-cast v1, LF/f;

    iget-object v1, v1, LF/f;->d:Ln/B;

    iget-object v3, v1, Ln/B;->b:[Ljava/lang/Object;

    iget-object v1, v1, Ln/B;->a:[J

    array-length v8, v1

    sub-int/2addr v8, v11

    if-ltz v8, :cond_1e

    move-object/from16 v23, v15

    move/from16 v9, v16

    move/from16 v22, v9

    :goto_0
    aget-wide v14, v1, v9

    not-long v11, v14

    shl-long/2addr v11, v10

    and-long/2addr v11, v14

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v11, v25

    cmp-long v11, v11, v25

    if-eqz v11, :cond_1d

    sub-int v11, v9, v8

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    move/from16 v12, v16

    :goto_1
    if-ge v12, v11, :cond_1c

    const-wide/16 v20, 0xff

    and-long v27, v14, v20

    const-wide/16 v18, 0x80

    cmp-long v13, v27, v18

    if-gez v13, :cond_1b

    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    aget-object v13, v3, v13

    instance-of v10, v13, LN/z;

    if-eqz v10, :cond_1

    move-object v10, v13

    check-cast v10, LN/z;

    move-object/from16 v28, v1

    const/4 v1, 0x2

    invoke-virtual {v10, v1}, LN/z;->e(I)Z

    move-result v10

    if-nez v10, :cond_0

    goto/16 :goto_16

    :cond_0
    :goto_2
    move-object/from16 v10, v23

    goto :goto_3

    :cond_1
    move-object/from16 v28, v1

    goto :goto_2

    :goto_3
    iget-object v1, v10, LA/t;->e:Ljava/lang/Object;

    check-cast v1, Ln/y;

    invoke-virtual {v1, v13}, Ln/y;->b(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v1, v10, LA/t;->e:Ljava/lang/Object;

    check-cast v1, Ln/y;

    invoke-virtual {v1, v13}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_14

    move-object/from16 v23, v3

    instance-of v3, v1, Ln/B;

    if-eqz v3, :cond_e

    check-cast v1, Ln/B;

    iget-object v3, v1, Ln/B;->b:[Ljava/lang/Object;

    iget-object v1, v1, Ln/B;->a:[J

    array-length v0, v1

    const/16 v24, 0x2

    add-int/lit8 v0, v0, -0x2

    if-ltz v0, :cond_c

    move/from16 p1, v8

    move/from16 v30, v9

    move-object/from16 v29, v10

    move/from16 v10, v16

    :goto_4
    aget-wide v8, v1, v10

    move/from16 v31, v11

    move/from16 v32, v12

    not-long v11, v8

    const/16 v27, 0x7

    shl-long v11, v11, v27

    and-long/2addr v11, v8

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v11, v25

    cmp-long v11, v11, v25

    if-eqz v11, :cond_b

    sub-int v11, v10, v0

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    move/from16 v12, v16

    :goto_5
    if-ge v12, v11, :cond_a

    const-wide/16 v20, 0xff

    and-long v33, v8, v20

    const-wide/16 v18, 0x80

    cmp-long v33, v33, v18

    if-gez v33, :cond_9

    shl-int/lit8 v33, v10, 0x3

    add-int v33, v33, v12

    aget-object v33, v3, v33

    move-object/from16 v34, v1

    move-object/from16 v1, v33

    check-cast v1, LD/D;

    invoke-static {v1, v4}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v33, v3

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v35, v4

    invoke-virtual {v1}, LD/D;->h()LD/B;

    move-result-object v4

    iget-object v4, v4, LD/B;->f:Ljava/lang/Object;

    invoke-static {v4, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    iget-object v3, v6, LA/t;->e:Ljava/lang/Object;

    check-cast v3, Ln/y;

    invoke-virtual {v3, v1}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    instance-of v3, v1, Ln/B;

    if-eqz v3, :cond_6

    check-cast v1, Ln/B;

    iget-object v3, v1, Ln/B;->b:[Ljava/lang/Object;

    iget-object v1, v1, Ln/B;->a:[J

    array-length v4, v1

    const/16 v24, 0x2

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_5

    move/from16 v38, v11

    move-wide/from16 v36, v14

    move/from16 v14, v16

    move v15, v10

    :goto_6
    aget-wide v10, v1, v14

    move-object/from16 v40, v1

    move-object/from16 v39, v2

    not-long v1, v10

    const/16 v27, 0x7

    shl-long v1, v1, v27

    and-long/2addr v1, v10

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v1, v1, v25

    cmp-long v1, v1, v25

    if-eqz v1, :cond_4

    sub-int v1, v14, v4

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v2, 0x8

    rsub-int/lit8 v1, v1, 0x8

    move/from16 v2, v16

    :goto_7
    if-ge v2, v1, :cond_3

    const-wide/16 v20, 0xff

    and-long v41, v10, v20

    const-wide/16 v18, 0x80

    cmp-long v41, v41, v18

    if-gez v41, :cond_2

    shl-int/lit8 v22, v14, 0x3

    add-int v22, v22, v2

    move/from16 v41, v15

    aget-object v15, v3, v22

    invoke-virtual {v7, v15}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v15, 0x8

    const/16 v22, 0x1

    goto :goto_8

    :cond_2
    move/from16 v41, v15

    const/16 v15, 0x8

    :goto_8
    shr-long/2addr v10, v15

    add-int/lit8 v2, v2, 0x1

    move/from16 v15, v41

    goto :goto_7

    :cond_3
    move/from16 v41, v15

    const/16 v15, 0x8

    if-ne v1, v15, :cond_8

    goto :goto_9

    :cond_4
    move/from16 v41, v15

    :goto_9
    if-eq v14, v4, :cond_8

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v2, v39

    move-object/from16 v1, v40

    move/from16 v15, v41

    goto :goto_6

    :cond_5
    move-object/from16 v39, v2

    goto :goto_b

    :cond_6
    move-object/from16 v39, v2

    move/from16 v41, v10

    move/from16 v38, v11

    move-wide/from16 v36, v14

    invoke-virtual {v7, v1}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v22, 0x1

    goto :goto_a

    :cond_7
    move-object/from16 v39, v2

    move/from16 v41, v10

    move/from16 v38, v11

    move-wide/from16 v36, v14

    invoke-virtual {v5, v1}, LF/d;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_a
    const/16 v1, 0x8

    goto :goto_c

    :cond_9
    move-object/from16 v34, v1

    move-object/from16 v39, v2

    move-object/from16 v33, v3

    move-object/from16 v35, v4

    :goto_b
    move/from16 v41, v10

    move/from16 v38, v11

    move-wide/from16 v36, v14

    goto :goto_a

    :goto_c
    shr-long/2addr v8, v1

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v3, v33

    move-object/from16 v1, v34

    move-object/from16 v4, v35

    move-wide/from16 v14, v36

    move/from16 v11, v38

    move-object/from16 v2, v39

    move/from16 v10, v41

    goto/16 :goto_5

    :cond_a
    move-object/from16 v34, v1

    move-object/from16 v39, v2

    move-object/from16 v33, v3

    move-object/from16 v35, v4

    move/from16 v41, v10

    move-wide/from16 v36, v14

    const/16 v1, 0x8

    move v14, v11

    if-ne v14, v1, :cond_d

    move/from16 v1, v41

    goto :goto_d

    :cond_b
    move-object/from16 v34, v1

    move-object/from16 v39, v2

    move-object/from16 v33, v3

    move-object/from16 v35, v4

    move-wide/from16 v36, v14

    move v1, v10

    :goto_d
    if-eq v1, v0, :cond_d

    add-int/lit8 v10, v1, 0x1

    move/from16 v11, v31

    move/from16 v12, v32

    move-object/from16 v3, v33

    move-object/from16 v1, v34

    move-object/from16 v4, v35

    move-wide/from16 v14, v36

    move-object/from16 v2, v39

    goto/16 :goto_4

    :cond_c
    move-object/from16 v39, v2

    move-object/from16 v35, v4

    move/from16 p1, v8

    move/from16 v30, v9

    move-object/from16 v29, v10

    move/from16 v31, v11

    move/from16 v32, v12

    move-wide/from16 v36, v14

    :cond_d
    move-object/from16 v0, v39

    goto/16 :goto_11

    :cond_e
    move-object/from16 v39, v2

    move-object/from16 v35, v4

    move/from16 p1, v8

    move/from16 v30, v9

    move-object/from16 v29, v10

    move/from16 v31, v11

    move/from16 v32, v12

    move-wide/from16 v36, v14

    check-cast v1, LD/D;

    move-object/from16 v0, v39

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, LD/D;->h()LD/B;

    move-result-object v3

    iget-object v3, v3, LD/B;->f:Ljava/lang/Object;

    invoke-static {v3, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    iget-object v2, v6, LA/t;->e:Ljava/lang/Object;

    check-cast v2, Ln/y;

    invoke-virtual {v2, v1}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_15

    instance-of v2, v1, Ln/B;

    if-eqz v2, :cond_12

    check-cast v1, Ln/B;

    iget-object v2, v1, Ln/B;->b:[Ljava/lang/Object;

    iget-object v1, v1, Ln/B;->a:[J

    array-length v3, v1

    const/4 v4, 0x2

    sub-int/2addr v3, v4

    if-ltz v3, :cond_15

    move/from16 v4, v16

    :goto_e
    aget-wide v8, v1, v4

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v14

    cmp-long v10, v10, v14

    if-eqz v10, :cond_11

    sub-int v10, v4, v3

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v14, v10, 0x8

    move/from16 v10, v16

    :goto_f
    if-ge v10, v14, :cond_10

    const-wide/16 v11, 0xff

    and-long v33, v8, v11

    const-wide/16 v11, 0x80

    cmp-long v15, v33, v11

    if-gez v15, :cond_f

    shl-int/lit8 v11, v4, 0x3

    add-int/2addr v11, v10

    aget-object v11, v2, v11

    invoke-virtual {v7, v11}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v11, 0x8

    const/16 v22, 0x1

    goto :goto_10

    :cond_f
    const/16 v11, 0x8

    :goto_10
    shr-long/2addr v8, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_f

    :cond_10
    const/16 v11, 0x8

    if-ne v14, v11, :cond_15

    :cond_11
    if-eq v4, v3, :cond_15

    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_12
    invoke-virtual {v7, v1}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v22, 0x1

    goto :goto_11

    :cond_13
    invoke-virtual {v5, v1}, LF/d;->b(Ljava/lang/Object;)V

    goto :goto_11

    :cond_14
    move-object v0, v2

    move-object/from16 v23, v3

    move-object/from16 v35, v4

    move/from16 p1, v8

    move/from16 v30, v9

    move-object/from16 v29, v10

    move/from16 v31, v11

    move/from16 v32, v12

    move-wide/from16 v36, v14

    :cond_15
    :goto_11
    iget-object v1, v6, LA/t;->e:Ljava/lang/Object;

    check-cast v1, Ln/y;

    invoke-virtual {v1, v13}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1a

    instance-of v2, v1, Ln/B;

    if-eqz v2, :cond_19

    check-cast v1, Ln/B;

    iget-object v2, v1, Ln/B;->b:[Ljava/lang/Object;

    iget-object v1, v1, Ln/B;->a:[J

    array-length v3, v1

    const/4 v4, 0x2

    sub-int/2addr v3, v4

    if-ltz v3, :cond_1a

    move/from16 v4, v16

    :goto_12
    aget-wide v8, v1, v4

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_18

    sub-int v10, v4, v3

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v14, v10, 0x8

    move/from16 v10, v16

    :goto_13
    if-ge v10, v14, :cond_17

    const-wide/16 v11, 0xff

    and-long v33, v8, v11

    const-wide/16 v11, 0x80

    cmp-long v13, v33, v11

    if-gez v13, :cond_16

    shl-int/lit8 v11, v4, 0x3

    add-int/2addr v11, v10

    aget-object v11, v2, v11

    invoke-virtual {v7, v11}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v11, 0x8

    const/16 v22, 0x1

    goto :goto_14

    :cond_16
    const/16 v11, 0x8

    :goto_14
    shr-long/2addr v8, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_13

    :cond_17
    const/16 v11, 0x8

    if-ne v14, v11, :cond_1a

    :cond_18
    if-eq v4, v3, :cond_1a

    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    :cond_19
    invoke-virtual {v7, v1}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v22, 0x1

    :cond_1a
    :goto_15
    const/16 v1, 0x8

    goto :goto_17

    :cond_1b
    move-object/from16 v28, v1

    :goto_16
    move-object v0, v2

    move-object/from16 v35, v4

    move/from16 p1, v8

    move/from16 v30, v9

    move/from16 v31, v11

    move/from16 v32, v12

    move-wide/from16 v36, v14

    move-object/from16 v29, v23

    move-object/from16 v23, v3

    goto :goto_15

    :goto_17
    shr-long v14, v36, v1

    add-int/lit8 v12, v32, 0x1

    const/4 v10, 0x7

    move/from16 v8, p1

    move-object v2, v0

    move-object/from16 v3, v23

    move-object/from16 v1, v28

    move-object/from16 v23, v29

    move/from16 v9, v30

    move/from16 v11, v31

    move-object/from16 v4, v35

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_1c
    move-object/from16 v28, v1

    move-object v0, v2

    move-object/from16 v35, v4

    move/from16 p1, v8

    move/from16 v30, v9

    move v14, v11

    move-object/from16 v29, v23

    const/16 v1, 0x8

    move-object/from16 v23, v3

    if-ne v14, v1, :cond_1f

    move/from16 v8, p1

    move/from16 v1, v30

    goto :goto_18

    :cond_1d
    move-object/from16 v28, v1

    move-object v0, v2

    move-object/from16 v35, v4

    move-object/from16 v29, v23

    move-object/from16 v23, v3

    move v1, v9

    :goto_18
    if-eq v1, v8, :cond_1f

    add-int/lit8 v9, v1, 0x1

    move-object v2, v0

    move-object/from16 v3, v23

    move-object/from16 v1, v28

    move-object/from16 v23, v29

    move-object/from16 v4, v35

    const/4 v10, 0x7

    const/4 v11, 0x2

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_1e
    move/from16 v22, v16

    :cond_1f
    move-object v1, v6

    goto/16 :goto_2c

    :cond_20
    move-object v0, v2

    move-object/from16 v35, v4

    move-object/from16 v29, v15

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v22, v16

    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, LN/z;

    if-eqz v3, :cond_21

    move-object v3, v2

    check-cast v3, LN/z;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, LN/z;->e(I)Z

    move-result v3

    if-nez v3, :cond_21

    move-object/from16 p1, v1

    move-object v1, v6

    move-object/from16 v23, v29

    goto/16 :goto_2b

    :cond_21
    move-object/from16 v3, v29

    iget-object v4, v3, LA/t;->e:Ljava/lang/Object;

    check-cast v4, Ln/y;

    invoke-virtual {v4, v2}, Ln/y;->b(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_34

    iget-object v4, v3, LA/t;->e:Ljava/lang/Object;

    check-cast v4, Ln/y;

    invoke-virtual {v4, v2}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_34

    instance-of v8, v4, Ln/B;

    if-eqz v8, :cond_2e

    check-cast v4, Ln/B;

    iget-object v8, v4, Ln/B;->b:[Ljava/lang/Object;

    iget-object v4, v4, Ln/B;->a:[J

    array-length v9, v4

    const/4 v10, 0x2

    sub-int/2addr v9, v10

    if-ltz v9, :cond_2c

    move/from16 v10, v16

    :goto_1a
    aget-wide v11, v4, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v13, v13, v25

    cmp-long v13, v13, v25

    if-eqz v13, :cond_2b

    sub-int v13, v10, v9

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    move/from16 v14, v16

    :goto_1b
    if-ge v14, v13, :cond_2a

    const-wide/16 v20, 0xff

    and-long v28, v11, v20

    const-wide/16 v18, 0x80

    cmp-long v15, v28, v18

    if-gez v15, :cond_29

    shl-int/lit8 v15, v10, 0x3

    add-int/2addr v15, v14

    aget-object v15, v8, v15

    check-cast v15, LD/D;

    move-object/from16 p1, v1

    move-object/from16 v1, v35

    invoke-static {v15, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v23, v3

    invoke-virtual {v15}, LD/D;->h()LD/B;

    move-result-object v3

    iget-object v3, v3, LD/B;->f:Ljava/lang/Object;

    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    iget-object v1, v6, LA/t;->e:Ljava/lang/Object;

    check-cast v1, Ln/y;

    invoke-virtual {v1, v15}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_25

    instance-of v3, v1, Ln/B;

    if-eqz v3, :cond_26

    check-cast v1, Ln/B;

    iget-object v3, v1, Ln/B;->b:[Ljava/lang/Object;

    iget-object v1, v1, Ln/B;->a:[J

    array-length v15, v1

    const/16 v24, 0x2

    add-int/lit8 v15, v15, -0x2

    if-ltz v15, :cond_25

    move-object/from16 v28, v4

    move-object/from16 v29, v8

    move/from16 v30, v9

    move/from16 v4, v16

    :goto_1c
    aget-wide v8, v1, v4

    move-object/from16 v32, v1

    move-object/from16 v31, v2

    not-long v1, v8

    const/16 v27, 0x7

    shl-long v1, v1, v27

    and-long/2addr v1, v8

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v1, v1, v25

    cmp-long v1, v1, v25

    if-eqz v1, :cond_24

    sub-int v1, v4, v15

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v2, 0x8

    rsub-int/lit8 v1, v1, 0x8

    move/from16 v2, v16

    :goto_1d
    if-ge v2, v1, :cond_23

    const-wide/16 v20, 0xff

    and-long v33, v8, v20

    const-wide/16 v18, 0x80

    cmp-long v33, v33, v18

    if-gez v33, :cond_22

    shl-int/lit8 v22, v4, 0x3

    add-int v22, v22, v2

    move-object/from16 v33, v6

    aget-object v6, v3, v22

    invoke-virtual {v7, v6}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v6, 0x8

    const/16 v22, 0x1

    goto :goto_1e

    :cond_22
    move-object/from16 v33, v6

    const/16 v6, 0x8

    :goto_1e
    shr-long/2addr v8, v6

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v6, v33

    goto :goto_1d

    :cond_23
    move-object/from16 v33, v6

    const/16 v6, 0x8

    if-ne v1, v6, :cond_28

    goto :goto_1f

    :cond_24
    move-object/from16 v33, v6

    :goto_1f
    if-eq v4, v15, :cond_28

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v2, v31

    move-object/from16 v1, v32

    move-object/from16 v6, v33

    goto :goto_1c

    :cond_25
    move-object/from16 v31, v2

    goto :goto_21

    :cond_26
    move-object/from16 v31, v2

    move-object/from16 v28, v4

    move-object/from16 v33, v6

    move-object/from16 v29, v8

    move/from16 v30, v9

    invoke-virtual {v7, v1}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v22, 0x1

    goto :goto_20

    :cond_27
    move-object/from16 v31, v2

    move-object/from16 v28, v4

    move-object/from16 v33, v6

    move-object/from16 v29, v8

    move/from16 v30, v9

    invoke-virtual {v5, v15}, LF/d;->b(Ljava/lang/Object;)V

    :cond_28
    :goto_20
    const/16 v1, 0x8

    goto :goto_22

    :cond_29
    move-object/from16 p1, v1

    move-object/from16 v31, v2

    move-object/from16 v23, v3

    :goto_21
    move-object/from16 v28, v4

    move-object/from16 v33, v6

    move-object/from16 v29, v8

    move/from16 v30, v9

    goto :goto_20

    :goto_22
    shr-long/2addr v11, v1

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, p1

    move-object/from16 v3, v23

    move-object/from16 v4, v28

    move-object/from16 v8, v29

    move/from16 v9, v30

    move-object/from16 v2, v31

    move-object/from16 v6, v33

    goto/16 :goto_1b

    :cond_2a
    move-object/from16 p1, v1

    move-object/from16 v31, v2

    move-object/from16 v23, v3

    move-object/from16 v28, v4

    move-object/from16 v33, v6

    move-object/from16 v29, v8

    move/from16 v30, v9

    const/16 v1, 0x8

    if-ne v13, v1, :cond_2d

    move/from16 v9, v30

    goto :goto_23

    :cond_2b
    move-object/from16 p1, v1

    move-object/from16 v31, v2

    move-object/from16 v23, v3

    move-object/from16 v28, v4

    move-object/from16 v33, v6

    move-object/from16 v29, v8

    :goto_23
    if-eq v10, v9, :cond_2d

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p1

    move-object/from16 v3, v23

    move-object/from16 v4, v28

    move-object/from16 v8, v29

    move-object/from16 v2, v31

    move-object/from16 v6, v33

    goto/16 :goto_1a

    :cond_2c
    move-object/from16 p1, v1

    move-object/from16 v31, v2

    move-object/from16 v23, v3

    move-object/from16 v33, v6

    :cond_2d
    move-object/from16 v1, v33

    goto/16 :goto_27

    :cond_2e
    move-object/from16 p1, v1

    move-object/from16 v31, v2

    move-object/from16 v23, v3

    move-object/from16 v33, v6

    check-cast v4, LD/D;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4}, LD/D;->h()LD/B;

    move-result-object v2

    iget-object v2, v2, LD/B;->f:Ljava/lang/Object;

    invoke-static {v2, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    move-object/from16 v1, v33

    iget-object v2, v1, LA/t;->e:Ljava/lang/Object;

    check-cast v2, Ln/y;

    invoke-virtual {v2, v4}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_35

    instance-of v3, v2, Ln/B;

    if-eqz v3, :cond_32

    check-cast v2, Ln/B;

    iget-object v3, v2, Ln/B;->b:[Ljava/lang/Object;

    iget-object v2, v2, Ln/B;->a:[J

    array-length v4, v2

    const/4 v6, 0x2

    sub-int/2addr v4, v6

    if-ltz v4, :cond_35

    move/from16 v6, v16

    :goto_24
    aget-wide v8, v2, v6

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_31

    sub-int v10, v6, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v14, v10, 0x8

    move/from16 v10, v16

    :goto_25
    if-ge v10, v14, :cond_30

    const-wide/16 v11, 0xff

    and-long v28, v8, v11

    const-wide/16 v11, 0x80

    cmp-long v13, v28, v11

    if-gez v13, :cond_2f

    shl-int/lit8 v11, v6, 0x3

    add-int/2addr v11, v10

    aget-object v11, v3, v11

    invoke-virtual {v7, v11}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v11, 0x8

    const/16 v22, 0x1

    goto :goto_26

    :cond_2f
    const/16 v11, 0x8

    :goto_26
    shr-long/2addr v8, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_25

    :cond_30
    const/16 v11, 0x8

    if-ne v14, v11, :cond_35

    :cond_31
    if-eq v6, v4, :cond_35

    add-int/lit8 v6, v6, 0x1

    goto :goto_24

    :cond_32
    invoke-virtual {v7, v2}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v22, 0x1

    goto :goto_27

    :cond_33
    move-object/from16 v1, v33

    invoke-virtual {v5, v4}, LF/d;->b(Ljava/lang/Object;)V

    goto :goto_27

    :cond_34
    move-object/from16 p1, v1

    move-object/from16 v31, v2

    move-object/from16 v23, v3

    move-object v1, v6

    :cond_35
    :goto_27
    iget-object v2, v1, LA/t;->e:Ljava/lang/Object;

    check-cast v2, Ln/y;

    move-object/from16 v3, v31

    invoke-virtual {v2, v3}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3a

    instance-of v3, v2, Ln/B;

    if-eqz v3, :cond_39

    check-cast v2, Ln/B;

    iget-object v3, v2, Ln/B;->b:[Ljava/lang/Object;

    iget-object v2, v2, Ln/B;->a:[J

    array-length v4, v2

    const/4 v6, 0x2

    sub-int/2addr v4, v6

    if-ltz v4, :cond_3a

    move/from16 v6, v16

    :goto_28
    aget-wide v8, v2, v6

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_38

    sub-int v10, v6, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v14, v10, 0x8

    move/from16 v10, v16

    :goto_29
    if-ge v10, v14, :cond_37

    const-wide/16 v11, 0xff

    and-long v28, v8, v11

    const-wide/16 v11, 0x80

    cmp-long v13, v28, v11

    if-gez v13, :cond_36

    shl-int/lit8 v11, v6, 0x3

    add-int/2addr v11, v10

    aget-object v11, v3, v11

    invoke-virtual {v7, v11}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v11, 0x8

    const/16 v22, 0x1

    goto :goto_2a

    :cond_36
    const/16 v11, 0x8

    :goto_2a
    shr-long/2addr v8, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_29

    :cond_37
    const/16 v11, 0x8

    if-ne v14, v11, :cond_3a

    :cond_38
    if-eq v6, v4, :cond_3a

    add-int/lit8 v6, v6, 0x1

    goto :goto_28

    :cond_39
    invoke-virtual {v7, v2}, Ln/B;->a(Ljava/lang/Object;)Z

    const/16 v22, 0x1

    :cond_3a
    :goto_2b
    move-object v6, v1

    move-object/from16 v29, v23

    move-object/from16 v1, p1

    goto/16 :goto_19

    :goto_2c
    invoke-virtual {v5}, LF/d;->k()Z

    move-result v0

    if-eqz v0, :cond_46

    iget v0, v5, LF/d;->f:I

    if-lez v0, :cond_45

    iget-object v2, v5, LF/d;->d:[Ljava/lang/Object;

    move/from16 v3, v16

    :goto_2d
    aget-object v4, v2, v3

    check-cast v4, LD/D;

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v6

    invoke-virtual {v6}, LN/h;->d()I

    move-result v6

    iget-object v7, v1, LA/t;->e:Ljava/lang/Object;

    check-cast v7, Ln/y;

    invoke-virtual {v7, v4}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_42

    instance-of v8, v7, Ln/B;

    move-object/from16 v9, p0

    iget-object v10, v9, LN/u;->f:Ln/y;

    if-eqz v8, :cond_40

    check-cast v7, Ln/B;

    iget-object v8, v7, Ln/B;->b:[Ljava/lang/Object;

    iget-object v7, v7, Ln/B;->a:[J

    array-length v11, v7

    const/4 v12, 0x2

    sub-int/2addr v11, v12

    if-ltz v11, :cond_3f

    move/from16 v13, v16

    :goto_2e
    aget-wide v14, v7, v13

    move/from16 p1, v13

    not-long v12, v14

    const/16 v17, 0x7

    shl-long v12, v12, v17

    and-long/2addr v12, v14

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v12, v12, v25

    cmp-long v12, v12, v25

    if-eqz v12, :cond_3e

    sub-int v13, p1, v11

    not-int v12, v13

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move/from16 v13, v16

    :goto_2f
    if-ge v13, v12, :cond_3d

    const-wide/16 v20, 0xff

    and-long v27, v14, v20

    const-wide/16 v18, 0x80

    cmp-long v23, v27, v18

    if-gez v23, :cond_3c

    shl-int/lit8 v23, p1, 0x3

    add-int v23, v23, v13

    move-object/from16 v33, v1

    aget-object v1, v8, v23

    invoke-virtual {v10, v1}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Ln/w;

    move-object/from16 v27, v2

    if-nez v23, :cond_3b

    new-instance v2, Ln/w;

    invoke-direct {v2}, Ln/w;-><init>()V

    invoke-virtual {v10, v1, v2}, Ln/y;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_30

    :cond_3b
    move-object/from16 v2, v23

    :goto_30
    invoke-virtual {v9, v4, v6, v1, v2}, LN/u;->c(Ljava/lang/Object;ILjava/lang/Object;Ln/w;)V

    :goto_31
    const/16 v1, 0x8

    goto :goto_32

    :cond_3c
    move-object/from16 v33, v1

    move-object/from16 v27, v2

    goto :goto_31

    :goto_32
    shr-long/2addr v14, v1

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, v27

    move-object/from16 v1, v33

    goto :goto_2f

    :cond_3d
    move-object/from16 v33, v1

    move-object/from16 v27, v2

    const/16 v1, 0x8

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    if-ne v12, v1, :cond_43

    :goto_33
    move/from16 v2, p1

    goto :goto_34

    :cond_3e
    move-object/from16 v33, v1

    move-object/from16 v27, v2

    const/16 v1, 0x8

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    goto :goto_33

    :goto_34
    if-eq v2, v11, :cond_43

    add-int/lit8 v13, v2, 0x1

    move-object/from16 v2, v27

    move-object/from16 v1, v33

    const/4 v12, 0x2

    goto :goto_2e

    :cond_3f
    move-object/from16 v33, v1

    move-object/from16 v27, v2

    const/16 v1, 0x8

    const/16 v17, 0x7

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_35

    :cond_40
    move-object/from16 v33, v1

    move-object/from16 v27, v2

    const/16 v1, 0x8

    const/16 v17, 0x7

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    invoke-virtual {v10, v7}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln/w;

    if-nez v2, :cond_41

    new-instance v2, Ln/w;

    invoke-direct {v2}, Ln/w;-><init>()V

    invoke-virtual {v10, v7, v2}, Ln/y;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_41
    invoke-virtual {v9, v4, v6, v7, v2}, LN/u;->c(Ljava/lang/Object;ILjava/lang/Object;Ln/w;)V

    goto :goto_35

    :cond_42
    move-object/from16 v33, v1

    move-object/from16 v27, v2

    const/16 v1, 0x8

    const/16 v17, 0x7

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    move-object/from16 v9, p0

    :cond_43
    :goto_35
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v0, :cond_44

    goto :goto_36

    :cond_44
    move-object/from16 v2, v27

    move-object/from16 v1, v33

    goto/16 :goto_2d

    :cond_45
    move-object/from16 v9, p0

    :goto_36
    invoke-virtual {v5}, LF/d;->g()V

    goto :goto_37

    :cond_46
    move-object/from16 v9, p0

    :goto_37
    return v22
.end method

.method public final c(Ljava/lang/Object;ILjava/lang/Object;Ln/w;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    iget v4, v0, LN/u;->j:I

    if-lez v4, :cond_0

    return-void

    :cond_0
    invoke-virtual {v3, v1}, Ln/w;->b(Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_1

    not-int v4, v4

    const/4 v6, -0x1

    goto :goto_0

    :cond_1
    iget-object v6, v3, Ln/w;->c:[I

    aget v6, v6, v4

    :goto_0
    iget-object v7, v3, Ln/w;->b:[Ljava/lang/Object;

    aput-object v1, v7, v4

    iget-object v3, v3, Ln/w;->c:[I

    aput v2, v3, v4

    instance-of v3, v1, LD/D;

    const/4 v4, 0x2

    if-eqz v3, :cond_6

    if-eq v6, v2, :cond_6

    move-object v2, v1

    check-cast v2, LD/D;

    invoke-virtual {v2}, LD/D;->h()LD/B;

    move-result-object v2

    iget-object v3, v0, LN/u;->l:Ljava/util/HashMap;

    iget-object v7, v2, LD/B;->f:Ljava/lang/Object;

    invoke-virtual {v3, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v2, LD/B;->e:Ln/w;

    iget-object v3, v0, LN/u;->k:LA/t;

    invoke-virtual {v3, v1}, LA/t;->F(Ljava/lang/Object;)V

    iget-object v7, v2, Ln/w;->b:[Ljava/lang/Object;

    iget-object v2, v2, Ln/w;->a:[J

    array-length v8, v2

    sub-int/2addr v8, v4

    if-ltz v8, :cond_6

    const/4 v10, 0x0

    :goto_1
    aget-wide v11, v2, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_5

    sub-int v13, v10, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v13, :cond_4

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_3

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v15

    aget-object v16, v7, v16

    move-object/from16 v9, v16

    check-cast v9, LN/y;

    instance-of v5, v9, LN/z;

    if-eqz v5, :cond_2

    move-object v5, v9

    check-cast v5, LN/z;

    invoke-virtual {v5, v4}, LN/z;->f(I)V

    :cond_2
    invoke-virtual {v3, v9, v1}, LA/t;->r(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    shr-long/2addr v11, v14

    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    :cond_4
    if-ne v13, v14, :cond_6

    :cond_5
    if-eq v10, v8, :cond_6

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_6
    const/4 v2, -0x1

    if-ne v6, v2, :cond_8

    instance-of v2, v1, LN/z;

    if-eqz v2, :cond_7

    move-object v2, v1

    check-cast v2, LN/z;

    invoke-virtual {v2, v4}, LN/z;->f(I)V

    :cond_7
    iget-object v2, v0, LN/u;->e:LA/t;

    move-object/from16 v3, p3

    invoke-virtual {v2, v1, v3}, LA/t;->r(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LN/u;->e:LA/t;

    invoke-virtual {v0, p2, p1}, LA/t;->D(Ljava/lang/Object;Ljava/lang/Object;)Z

    instance-of p1, p2, LD/D;

    if-eqz p1, :cond_0

    iget-object p1, v0, LA/t;->e:Ljava/lang/Object;

    check-cast p1, Ln/y;

    invoke-virtual {p1, p2}, Ln/y;->b(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LN/u;->k:LA/t;

    invoke-virtual {p1, p2}, LA/t;->F(Ljava/lang/Object;)V

    iget-object p1, p0, LN/u;->l:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 33

    move-object/from16 v0, p0

    sget-object v1, Ln0/J;->j:Ln0/J;

    iget-object v2, v0, LN/u;->f:Ln/y;

    iget-object v3, v2, Ln/y;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_a

    const/4 v6, 0x0

    :goto_0
    aget-wide v7, v3, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v12

    cmp-long v9, v9, v12

    if-eqz v9, :cond_9

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v9, :cond_8

    const-wide/16 v15, 0xff

    and-long v17, v7, v15

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_7

    shl-int/lit8 v17, v6, 0x3

    add-int v5, v17, v14

    iget-object v15, v2, Ln/y;->b:[Ljava/lang/Object;

    aget-object v15, v15, v5

    iget-object v10, v2, Ln/y;->c:[Ljava/lang/Object;

    aget-object v10, v10, v5

    check-cast v10, Ln/w;

    invoke-virtual {v1, v15}, Ln0/J;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Boolean;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v23

    if-eqz v23, :cond_4

    iget-object v12, v10, Ln/w;->b:[Ljava/lang/Object;

    iget-object v13, v10, Ln/w;->c:[I

    iget-object v10, v10, Ln/w;->a:[J

    array-length v11, v10

    add-int/lit8 v11, v11, -0x2

    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move/from16 v28, v4

    if-ltz v11, :cond_3

    const/4 v1, 0x0

    :goto_2
    aget-wide v3, v10, v1

    move/from16 v29, v9

    move-object/from16 v30, v10

    not-long v9, v3

    const/16 v25, 0x7

    shl-long v9, v9, v25

    and-long/2addr v9, v3

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v9, v9, v23

    cmp-long v9, v9, v23

    if-eqz v9, :cond_2

    sub-int v9, v1, v11

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v9, :cond_1

    const-wide/16 v21, 0xff

    and-long v31, v3, v21

    cmp-long v31, v31, v19

    if-gez v31, :cond_0

    shl-int/lit8 v31, v1, 0x3

    add-int v31, v31, v10

    move/from16 v32, v6

    aget-object v6, v12, v31

    aget v31, v13, v31

    invoke-virtual {v0, v15, v6}, LN/u;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    const/16 v6, 0x8

    goto :goto_5

    :cond_0
    move/from16 v32, v6

    goto :goto_4

    :goto_5
    shr-long/2addr v3, v6

    add-int/lit8 v10, v10, 0x1

    move/from16 v6, v32

    goto :goto_3

    :cond_1
    move/from16 v32, v6

    const/16 v6, 0x8

    const-wide/16 v21, 0xff

    if-ne v9, v6, :cond_5

    goto :goto_6

    :cond_2
    move/from16 v32, v6

    const-wide/16 v21, 0xff

    :goto_6
    if-eq v1, v11, :cond_5

    add-int/lit8 v1, v1, 0x1

    move/from16 v9, v29

    move-object/from16 v10, v30

    move/from16 v6, v32

    goto :goto_2

    :cond_3
    move/from16 v32, v6

    move/from16 v29, v9

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v25, 0x7

    goto :goto_7

    :cond_4
    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v32, v6

    move/from16 v29, v9

    move/from16 v25, v11

    move-wide/from16 v23, v12

    :cond_5
    :goto_7
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v2, v5}, Ln/y;->h(I)Ljava/lang/Object;

    :cond_6
    const/16 v1, 0x8

    goto :goto_8

    :cond_7
    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v32, v6

    move/from16 v29, v9

    move/from16 v25, v11

    move-wide/from16 v23, v12

    move v1, v10

    :goto_8
    shr-long/2addr v7, v1

    add-int/lit8 v14, v14, 0x1

    move v10, v1

    move-wide/from16 v12, v23

    move/from16 v11, v25

    move-object/from16 v1, v26

    move-object/from16 v3, v27

    move/from16 v4, v28

    move/from16 v9, v29

    move/from16 v6, v32

    goto/16 :goto_1

    :cond_8
    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v32, v6

    move v1, v10

    move v10, v9

    if-ne v10, v1, :cond_a

    move/from16 v4, v28

    move/from16 v5, v32

    goto :goto_9

    :cond_9
    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move v5, v6

    :goto_9
    if-eq v5, v4, :cond_a

    add-int/lit8 v6, v5, 0x1

    move-object/from16 v1, v26

    move-object/from16 v3, v27

    goto/16 :goto_0

    :cond_a
    return-void
.end method
