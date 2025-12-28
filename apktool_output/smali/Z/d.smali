.class public final LZ/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZ/f;

.field public b:LG0/b;

.field public c:LG0/f;

.field public d:Lp2/h;

.field public e:Landroid/graphics/Outline;

.field public f:Z

.field public g:J

.field public h:J

.field public i:F

.field public j:LW/B;

.field public k:LW/i;

.field public l:LW/i;

.field public m:Z

.field public n:LW/g;

.field public o:I

.field public final p:LZ/a;

.field public q:Z

.field public r:J

.field public s:J

.field public t:J


# direct methods
.method public constructor <init>(LZ/f;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ/d;->a:LZ/f;

    sget-object v0, LY/c;->a:LG0/c;

    iput-object v0, p0, LZ/d;->b:LG0/b;

    sget-object v0, LG0/f;->d:LG0/f;

    iput-object v0, p0, LZ/d;->c:LG0/f;

    sget-object v0, LZ/c;->f:LZ/c;

    iput-object v0, p0, LZ/d;->d:Lp2/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, LZ/d;->f:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LZ/d;->g:J

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v2, p0, LZ/d;->h:J

    new-instance v4, LZ/a;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, LZ/d;->p:LZ/a;

    const/4 v4, 0x0

    invoke-interface {p1, v4}, LZ/f;->J(Z)V

    iput-wide v0, p0, LZ/d;->r:J

    iput-wide v0, p0, LZ/d;->s:J

    iput-wide v2, p0, LZ/d;->t:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    iget-boolean v0, p0, LZ/d;->f:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, LZ/d;->a:LZ/f;

    invoke-interface {v0}, LZ/f;->e()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, LZ/f;->B()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, LZ/f;->l(Landroid/graphics/Outline;)V

    goto/16 :goto_5

    :cond_1
    :goto_0
    iget-object v1, p0, LZ/d;->k:LW/i;

    if-eqz v1, :cond_7

    iget-object v2, p0, LZ/d;->e:Landroid/graphics/Outline;

    if-nez v2, :cond_2

    new-instance v2, Landroid/graphics/Outline;

    invoke-direct {v2}, Landroid/graphics/Outline;-><init>()V

    iput-object v2, p0, LZ/d;->e:Landroid/graphics/Outline;

    :cond_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v4, v1, LW/i;->a:Landroid/graphics/Path;

    const/16 v5, 0x1c

    const/4 v6, 0x1

    if-gt v3, v5, :cond_5

    invoke-virtual {v4}, Landroid/graphics/Path;->isConvex()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    iget-object v3, p0, LZ/d;->e:Landroid/graphics/Outline;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/graphics/Outline;->setEmpty()V

    :cond_4
    iput-boolean v6, p0, LZ/d;->m:Z

    goto :goto_3

    :cond_5
    :goto_1
    const/16 v5, 0x1e

    if-le v3, v5, :cond_6

    sget-object v3, LZ/l;->a:LZ/l;

    invoke-virtual {v3, v2, v1}, LZ/l;->a(Landroid/graphics/Outline;LW/C;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v4}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    :goto_2
    invoke-virtual {v2}, Landroid/graphics/Outline;->canClip()Z

    move-result v3

    xor-int/2addr v3, v6

    iput-boolean v3, p0, LZ/d;->m:Z

    :goto_3
    iput-object v1, p0, LZ/d;->k:LW/i;

    invoke-interface {v0}, LZ/f;->a()F

    move-result v1

    invoke-virtual {v2, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    invoke-interface {v0, v2}, LZ/f;->l(Landroid/graphics/Outline;)V

    goto :goto_5

    :cond_7
    iget-object v1, p0, LZ/d;->e:Landroid/graphics/Outline;

    if-nez v1, :cond_8

    new-instance v1, Landroid/graphics/Outline;

    invoke-direct {v1}, Landroid/graphics/Outline;-><init>()V

    iput-object v1, p0, LZ/d;->e:Landroid/graphics/Outline;

    :cond_8
    iget-wide v2, p0, LZ/d;->s:J

    invoke-static {v2, v3}, Lr2/a;->c0(J)J

    move-result-wide v2

    iget-wide v4, p0, LZ/d;->g:J

    iget-wide v6, p0, LZ/d;->h:J

    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v8, v6, v8

    if-nez v8, :cond_9

    goto :goto_4

    :cond_9
    move-wide v2, v6

    :goto_4
    invoke-static {v4, v5}, LV/c;->b(J)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-static {v4, v5}, LV/c;->c(J)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    invoke-static {v4, v5}, LV/c;->b(J)F

    move-result v8

    invoke-static {v2, v3}, LV/f;->d(J)F

    move-result v9

    add-float/2addr v9, v8

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-static {v4, v5}, LV/c;->c(J)F

    move-result v4

    invoke-static {v2, v3}, LV/f;->b(J)F

    move-result v2

    add-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v9

    iget v10, p0, LZ/d;->i:F

    move-object v2, v1

    move v3, v6

    move v4, v7

    move v5, v8

    move v6, v9

    move v7, v10

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-interface {v0}, LZ/f;->a()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Outline;->setAlpha(F)V

    invoke-interface {v0, v1}, LZ/f;->l(Landroid/graphics/Outline;)V

    :cond_a
    :goto_5
    const/4 v0, 0x0

    iput-boolean v0, p0, LZ/d;->f:Z

    return-void
.end method

.method public final b()V
    .locals 15

    iget-boolean v0, p0, LZ/d;->q:Z

    if-eqz v0, :cond_6

    iget v0, p0, LZ/d;->o:I

    if-nez v0, :cond_6

    iget-object v0, p0, LZ/d;->p:LZ/a;

    iget-object v1, v0, LZ/a;->b:Ljava/lang/Object;

    check-cast v1, LZ/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LZ/d;->d()V

    const/4 v1, 0x0

    iput-object v1, v0, LZ/a;->b:Ljava/lang/Object;

    :cond_0
    iget-object v0, v0, LZ/a;->d:Ljava/lang/Object;

    check-cast v0, Ln/B;

    if-eqz v0, :cond_5

    iget-object v1, v0, Ln/B;->b:[Ljava/lang/Object;

    iget-object v2, v0, Ln/B;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_4

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    aget-wide v6, v2, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_3

    sub-int v8, v5, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v4

    :goto_1
    if-ge v10, v8, :cond_2

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_1

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v1, v11

    check-cast v11, LZ/d;

    invoke-virtual {v11}, LZ/d;->d()V

    :cond_1
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    if-ne v8, v9, :cond_4

    :cond_3
    if-eq v5, v3, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ln/B;->b()V

    :cond_5
    iget-object v0, p0, LZ/d;->a:LZ/f;

    invoke-interface {v0}, LZ/f;->o()V

    :cond_6
    return-void
.end method

.method public final c()LW/B;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LZ/d;->j:LW/B;

    iget-object v2, v0, LZ/d;->k:LW/i;

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    if-eqz v2, :cond_1

    new-instance v1, LW/y;

    invoke-direct {v1, v2}, LW/y;-><init>(LW/i;)V

    iput-object v1, v0, LZ/d;->j:LW/B;

    goto :goto_2

    :cond_1
    iget-wide v1, v0, LZ/d;->s:J

    invoke-static {v1, v2}, Lr2/a;->c0(J)J

    move-result-wide v1

    iget-wide v3, v0, LZ/d;->g:J

    iget-wide v5, v0, LZ/d;->h:J

    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v7, v5, v7

    if-nez v7, :cond_2

    goto :goto_0

    :cond_2
    move-wide v1, v5

    :goto_0
    invoke-static {v3, v4}, LV/c;->b(J)F

    move-result v6

    invoke-static {v3, v4}, LV/c;->c(J)F

    move-result v7

    invoke-static {v1, v2}, LV/f;->d(J)F

    move-result v3

    add-float v8, v3, v6

    invoke-static {v1, v2}, LV/f;->b(J)F

    move-result v1

    add-float v9, v1, v7

    iget v1, v0, LZ/d;->i:F

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_3

    new-instance v2, LW/A;

    invoke-static {v1, v1}, Lr2/a;->a(FF)J

    move-result-wide v3

    invoke-static {v3, v4}, LV/a;->b(J)F

    move-result v1

    invoke-static {v3, v4}, LV/a;->c(J)F

    move-result v3

    invoke-static {v1, v3}, Lr2/a;->a(FF)J

    move-result-wide v16

    new-instance v1, LV/e;

    move-object v5, v1

    move-wide/from16 v10, v16

    move-wide/from16 v12, v16

    move-wide/from16 v14, v16

    invoke-direct/range {v5 .. v17}, LV/e;-><init>(FFFFJJJJ)V

    invoke-direct {v2, v1}, LW/A;-><init>(LV/e;)V

    move-object v1, v2

    goto :goto_1

    :cond_3
    new-instance v1, LW/z;

    new-instance v2, LV/d;

    invoke-direct {v2, v6, v7, v8, v9}, LV/d;-><init>(FFFF)V

    invoke-direct {v1, v2}, LW/z;-><init>(LV/d;)V

    :goto_1
    iput-object v1, v0, LZ/d;->j:LW/B;

    :goto_2
    return-object v1
.end method

.method public final d()V
    .locals 1

    iget v0, p0, LZ/d;->o:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LZ/d;->o:I

    invoke-virtual {p0}, LZ/d;->b()V

    return-void
.end method

.method public final e()V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x1

    iget-object v2, v0, LZ/d;->p:LZ/a;

    iget-object v3, v2, LZ/a;->b:Ljava/lang/Object;

    check-cast v3, LZ/d;

    iput-object v3, v2, LZ/a;->c:Ljava/lang/Object;

    iget-object v3, v2, LZ/a;->d:Ljava/lang/Object;

    check-cast v3, Ln/B;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ln/B;->h()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v2, LZ/a;->e:Ljava/lang/Object;

    check-cast v4, Ln/B;

    if-nez v4, :cond_0

    sget v4, Ln/E;->a:I

    new-instance v4, Ln/B;

    invoke-direct {v4}, Ln/B;-><init>()V

    iput-object v4, v2, LZ/a;->e:Ljava/lang/Object;

    :cond_0
    invoke-virtual {v4, v3}, Ln/B;->i(Ln/B;)V

    invoke-virtual {v3}, Ln/B;->b()V

    :cond_1
    iput-boolean v1, v2, LZ/a;->a:Z

    iget-object v3, v0, LZ/d;->b:LG0/b;

    iget-object v4, v0, LZ/d;->c:LG0/f;

    iget-object v5, v0, LZ/d;->d:Lp2/h;

    iget-object v6, v0, LZ/d;->a:LZ/f;

    invoke-interface {v6, v3, v4, v0, v5}, LZ/f;->y(LG0/b;LG0/f;LZ/d;Lo2/c;)V

    const/4 v3, 0x0

    iput-boolean v3, v2, LZ/a;->a:Z

    iget-object v4, v2, LZ/a;->c:Ljava/lang/Object;

    check-cast v4, LZ/d;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, LZ/d;->d()V

    :cond_2
    iget-object v2, v2, LZ/a;->e:Ljava/lang/Object;

    check-cast v2, Ln/B;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ln/B;->h()Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v4, v2, Ln/B;->b:[Ljava/lang/Object;

    iget-object v5, v2, Ln/B;->a:[J

    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_6

    move v7, v3

    :goto_0
    aget-wide v8, v5, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_5

    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v3

    :goto_1
    if-ge v12, v10, :cond_4

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_3

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v13, v4, v13

    check-cast v13, LZ/d;

    invoke-virtual {v13}, LZ/d;->d()V

    :cond_3
    shr-long/2addr v8, v11

    add-int/2addr v12, v1

    goto :goto_1

    :cond_4
    if-ne v10, v11, :cond_6

    :cond_5
    if-eq v7, v6, :cond_6

    add-int/2addr v7, v1

    goto :goto_0

    :cond_6
    invoke-virtual {v2}, Ln/B;->b()V

    :cond_7
    return-void
.end method

.method public final f(JJF)V
    .locals 2

    iget-wide v0, p0, LZ/d;->g:J

    invoke-static {v0, v1, p1, p2}, LV/c;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, LZ/d;->h:J

    invoke-static {v0, v1, p3, p4}, LV/f;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LZ/d;->i:F

    cmpg-float v0, v0, p5

    if-nez v0, :cond_0

    iget-object v0, p0, LZ/d;->k:LW/i;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LZ/d;->j:LW/B;

    iput-object v0, p0, LZ/d;->k:LW/i;

    const/4 v0, 0x1

    iput-boolean v0, p0, LZ/d;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LZ/d;->m:Z

    iput-wide p1, p0, LZ/d;->g:J

    iput-wide p3, p0, LZ/d;->h:J

    iput p5, p0, LZ/d;->i:F

    invoke-virtual {p0}, LZ/d;->a()V

    :cond_1
    return-void
.end method
