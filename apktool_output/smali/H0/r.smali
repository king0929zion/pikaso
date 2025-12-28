.class public final Lh0/r;
.super LP/k;
.source "SourceFile"

# interfaces
.implements LG0/b;
.implements Ln0/j0;


# instance fields
.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public s:[Ljava/lang/Object;

.field public t:Li2/j;

.field public u:Ly2/h0;

.field public v:Lh0/f;

.field public final w:LF/d;

.field public final x:LF/d;

.field public y:Lh0/f;

.field public z:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lo2/e;)V
    .locals 0

    invoke-direct {p0}, LP/k;-><init>()V

    iput-object p1, p0, Lh0/r;->q:Ljava/lang/Object;

    iput-object p2, p0, Lh0/r;->r:Ljava/lang/Object;

    iput-object p3, p0, Lh0/r;->s:[Ljava/lang/Object;

    check-cast p4, Li2/j;

    iput-object p4, p0, Lh0/r;->t:Li2/j;

    sget-object p1, Lh0/o;->a:Lh0/f;

    iput-object p1, p0, Lh0/r;->v:Lh0/f;

    new-instance p1, LF/d;

    const/16 p2, 0x10

    new-array p3, p2, [Lh0/p;

    invoke-direct {p1, p3}, LF/d;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lh0/r;->w:LF/d;

    new-instance p1, LF/d;

    new-array p2, p2, [Lh0/p;

    invoke-direct {p1, p2}, LF/d;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lh0/r;->x:LF/d;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lh0/r;->z:J

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lh0/r;->y:Lh0/f;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v1, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh0/k;

    iget-boolean v5, v5, Lh0/k;->d:Z

    if-eqz v5, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    :goto_1
    if-ge v3, v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh0/k;

    iget-wide v7, v5, Lh0/k;->a:J

    new-instance v6, Lh0/k;

    iget-boolean v9, v5, Lh0/k;->d:Z

    move/from16 v19, v9

    move/from16 v20, v9

    const/16 v21, 0x1

    iget-wide v9, v5, Lh0/k;->b:J

    move-wide v15, v9

    iget-wide v13, v5, Lh0/k;->c:J

    move-wide v11, v13

    move-wide/from16 v17, v13

    const/4 v13, 0x0

    iget v14, v5, Lh0/k;->e:F

    const-wide/16 v22, 0x0

    move-object v5, v6

    invoke-direct/range {v6 .. v23}, Lh0/k;-><init>(JJJZFJJZZIJ)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    new-instance v1, Lh0/f;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lh0/f;-><init>(Ljava/util/List;LB2/i;)V

    iput-object v1, v0, Lh0/r;->v:Lh0/f;

    sget-object v2, Lh0/g;->d:Lh0/g;

    invoke-virtual {v0, v1, v2}, Lh0/r;->f0(Lh0/f;Lh0/g;)V

    sget-object v2, Lh0/g;->e:Lh0/g;

    invoke-virtual {v0, v1, v2}, Lh0/r;->f0(Lh0/f;Lh0/g;)V

    sget-object v2, Lh0/g;->f:Lh0/g;

    invoke-virtual {v0, v1, v2}, Lh0/r;->f0(Lh0/f;Lh0/g;)V

    iput-object v3, v0, Lh0/r;->y:Lh0/f;

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final Z()V
    .locals 0

    invoke-virtual {p0}, Lh0/r;->g0()V

    return-void
.end method

.method public final c()V
    .locals 0

    invoke-virtual {p0}, Lh0/r;->g0()V

    return-void
.end method

.method public final f()F
    .locals 1

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v0

    iget-object v0, v0, Ln0/z;->s:LG0/b;

    invoke-interface {v0}, LG0/b;->f()F

    move-result v0

    return v0
.end method

.method public final f0(Lh0/f;Lh0/g;)V
    .locals 6

    iget-object v0, p0, Lh0/r;->w:LF/d;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh0/r;->x:LF/d;

    iget-object v2, p0, Lh0/r;->w:LF/d;

    iget v3, v1, LF/d;->f:I

    invoke-virtual {v1, v3, v2}, LF/d;->c(ILF/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh0/r;->x:LF/d;

    iget v3, v0, LF/d;->f:I

    if-lez v3, :cond_6

    sub-int/2addr v3, v2

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    :cond_1
    aget-object v2, v0, v3

    check-cast v2, Lh0/p;

    iget-object v4, v2, Lh0/p;->g:Lh0/g;

    if-ne p2, v4, :cond_2

    iget-object v4, v2, Lh0/p;->f:Ly2/f;

    if-eqz v4, :cond_2

    iput-object v1, v2, Lh0/p;->f:Ly2/f;

    invoke-virtual {v4, p1}, Ly2/f;->t(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v3, v3, -0x1

    if-gez v3, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lh0/r;->x:LF/d;

    iget v2, v0, LF/d;->f:I

    if-lez v2, :cond_6

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_4
    aget-object v4, v0, v3

    check-cast v4, Lh0/p;

    iget-object v5, v4, Lh0/p;->g:Lh0/g;

    if-ne p2, v5, :cond_5

    iget-object v5, v4, Lh0/p;->f:Ly2/f;

    if-eqz v5, :cond_5

    iput-object v1, v4, Lh0/p;->f:Ly2/f;

    invoke-virtual {v5, p1}, Ly2/f;->t(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_4

    :cond_6
    :goto_0
    iget-object p1, p0, Lh0/r;->x:LF/d;

    invoke-virtual {p1}, LF/d;->g()V

    return-void

    :goto_1
    iget-object p2, p0, Lh0/r;->x:LF/d;

    invoke-virtual {p2}, LF/d;->g()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final g0()V
    .locals 4

    iget-object v0, p0, Lh0/r;->u:Ly2/h0;

    if-eqz v0, :cond_0

    new-instance v1, LC2/o;

    const-string v2, "Pointer input was reset"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, LC2/o;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Ly2/b0;->B(Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lh0/r;->u:Ly2/h0;

    :cond_0
    return-void
.end method

.method public final n()F
    .locals 1

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v0

    iget-object v0, v0, Ln0/z;->s:LG0/b;

    invoke-interface {v0}, LG0/b;->n()F

    move-result v0

    return v0
.end method

.method public final t()V
    .locals 0

    invoke-virtual {p0}, Lh0/r;->g0()V

    return-void
.end method

.method public final y(Lh0/f;Lh0/g;J)V
    .locals 3

    iput-wide p3, p0, Lh0/r;->z:J

    sget-object p3, Lh0/g;->d:Lh0/g;

    if-ne p2, p3, :cond_0

    iput-object p1, p0, Lh0/r;->v:Lh0/f;

    :cond_0
    iget-object p3, p0, Lh0/r;->u:Ly2/h0;

    const/4 p4, 0x0

    if-nez p3, :cond_1

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object p3

    new-instance v0, Lh0/q;

    invoke-direct {v0, p0, p4}, Lh0/q;-><init>(Lh0/r;Lg2/d;)V

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-static {p3, p4, v1, v0, v2}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    move-result-object p3

    iput-object p3, p0, Lh0/r;->u:Ly2/h0;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lh0/r;->f0(Lh0/f;Lh0/g;)V

    iget-object p2, p1, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh0/k;

    invoke-static {v1}, LZ0/d;->n(Lh0/k;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move-object p1, p4

    :goto_1
    iput-object p1, p0, Lh0/r;->y:Lh0/f;

    return-void
.end method
