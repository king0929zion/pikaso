.class public LB2/v;
.super LC2/b;
.source "SourceFile"

# interfaces
.implements LB2/e;
.implements LB2/f;
.implements LC2/q;


# instance fields
.field public final h:I

.field public final i:I

.field public final j:I

.field public k:[Ljava/lang/Object;

.field public l:J

.field public m:J

.field public n:I

.field public o:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LB2/v;->h:I

    iput p2, p0, LB2/v;->i:I

    iput p3, p0, LB2/v;->j:I

    return-void
.end method

.method public static i(LB2/v;LB2/f;Lg2/d;)V
    .locals 8

    instance-of v0, p2, LB2/u;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LB2/u;

    iget v1, v0, LB2/u;->m:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LB2/u;->m:I

    goto :goto_0

    :cond_0
    new-instance v0, LB2/u;

    invoke-direct {v0, p0, p2}, LB2/u;-><init>(LB2/v;Lg2/d;)V

    :goto_0
    iget-object p2, v0, LB2/u;->k:Ljava/lang/Object;

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, v0, LB2/u;->m:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eqz v2, :cond_5

    const/4 p0, 0x1

    if-eq v2, p0, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p0, v0, LB2/u;->j:Ly2/S;

    iget-object p1, v0, LB2/u;->i:LB2/x;

    iget-object v2, v0, LB2/u;->h:LB2/f;

    iget-object v5, v0, LB2/u;->g:LB2/v;

    :try_start_0
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p2, v2

    move-object v2, p0

    move-object p0, v5

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-object p0, v0, LB2/u;->j:Ly2/S;

    iget-object p1, v0, LB2/u;->i:LB2/x;

    iget-object v2, v0, LB2/u;->h:LB2/f;

    iget-object v5, v0, LB2/u;->g:LB2/v;

    :try_start_1
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :cond_4
    iget-object p1, v0, LB2/u;->i:LB2/x;

    iget-object p0, v0, LB2/u;->h:LB2/f;

    iget-object v2, v0, LB2/u;->g:LB2/v;

    :try_start_2
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object p2, p0

    move-object p0, v2

    goto :goto_1

    :catchall_1
    move-exception p0

    move-object v5, v2

    goto :goto_5

    :cond_5
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V

    invoke-virtual {p0}, LC2/b;->a()LC2/d;

    move-result-object p2

    check-cast p2, LB2/x;

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_1
    :try_start_3
    iget-object v2, v0, Li2/c;->e:Lg2/i;

    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    sget-object v5, Ly2/s;->e:Ly2/s;

    invoke-interface {v2, v5}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v2

    check-cast v2, Ly2/S;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_2
    move-object v5, p0

    move-object p0, v2

    move-object v2, p2

    :cond_6
    :goto_3
    :try_start_4
    invoke-virtual {v5, p1}, LB2/v;->t(LB2/x;)Ljava/lang/Object;

    move-result-object p2

    sget-object v6, LB2/w;->a:LD2/w;

    if-ne p2, v6, :cond_7

    iput-object v5, v0, LB2/u;->g:LB2/v;

    iput-object v2, v0, LB2/u;->h:LB2/f;

    iput-object p1, v0, LB2/u;->i:LB2/x;

    iput-object p0, v0, LB2/u;->j:Ly2/S;

    iput v4, v0, LB2/u;->m:I

    invoke-virtual {v5, p1, v0}, LB2/v;->g(LB2/x;LB2/u;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-void

    :cond_7
    if-eqz p0, :cond_9

    invoke-interface {p0}, Ly2/S;->b()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_4

    :cond_8
    invoke-interface {p0}, Ly2/S;->f()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0

    :cond_9
    :goto_4
    iput-object v5, v0, LB2/u;->g:LB2/v;

    iput-object v2, v0, LB2/u;->h:LB2/f;

    iput-object p1, v0, LB2/u;->i:LB2/x;

    iput-object p0, v0, LB2/u;->j:Ly2/S;

    iput v3, v0, LB2/u;->m:I

    invoke-interface {v2, p2, v0}, LB2/f;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne p2, v1, :cond_1

    return-void

    :catchall_2
    move-exception p2

    move-object v5, p0

    move-object p0, p2

    :goto_5
    invoke-virtual {v5, p1}, LC2/b;->e(LC2/d;)V

    throw p0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p0, p1}, LB2/v;->q(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lc2/m;->a:Lc2/m;

    goto/16 :goto_3

    :cond_0
    new-instance v6, Ly2/f;

    invoke-static {p2}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object p2

    const/4 v7, 0x1

    invoke-direct {v6, v7, p2}, Ly2/f;-><init>(ILg2/d;)V

    invoke-virtual {v6}, Ly2/f;->u()V

    sget-object p2, LC2/c;->a:[Lg2/d;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, LB2/v;->r(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lc2/m;->a:Lc2/m;

    invoke-virtual {v6, p1}, Ly2/f;->t(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, LB2/v;->l([Lg2/d;)[Lg2/d;

    move-result-object p1

    const/4 p2, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance v8, LB2/t;

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v0

    iget v2, p0, LB2/v;->n:I

    iget v3, p0, LB2/v;->o:I

    add-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v2, v0

    move-object v0, v8

    move-object v1, p0

    move-object v4, p1

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, LB2/t;-><init>(LB2/v;JLjava/lang/Object;Ly2/f;)V

    invoke-virtual {p0, v8}, LB2/v;->k(Ljava/lang/Object;)V

    iget p1, p0, LB2/v;->o:I

    add-int/2addr p1, v7

    iput p1, p0, LB2/v;->o:I

    iget p1, p0, LB2/v;->i:I

    if-nez p1, :cond_2

    invoke-virtual {p0, p2}, LB2/v;->l([Lg2/d;)[Lg2/d;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    move-object p1, p2

    move-object p2, v8

    :goto_0
    monitor-exit p0

    if-eqz p2, :cond_3

    new-instance v0, Ly2/D;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Ly2/D;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v6, v0}, Ly2/f;->x(Lo2/c;)V

    :cond_3
    array-length p2, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p2, :cond_5

    aget-object v1, p1, v0

    if-eqz v1, :cond_4

    sget-object v2, Lc2/m;->a:Lc2/m;

    invoke-interface {v1, v2}, Lg2/d;->t(Ljava/lang/Object;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Ly2/f;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lh2/a;->d:Lh2/a;

    if-ne p1, p2, :cond_6

    goto :goto_2

    :cond_6
    sget-object p1, Lc2/m;->a:Lc2/m;

    :goto_2
    if-ne p1, p2, :cond_7

    goto :goto_3

    :cond_7
    sget-object p1, Lc2/m;->a:Lc2/m;

    :goto_3
    return-object p1

    :goto_4
    monitor-exit p0

    throw p1
.end method

.method public final c()LC2/d;
    .locals 3

    new-instance v0, LB2/x;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, -0x1

    iput-wide v1, v0, LB2/x;->a:J

    return-object v0
.end method

.method public final d()[LC2/d;
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [LB2/x;

    return-object v0
.end method

.method public final g(LB2/x;LB2/u;)Ljava/lang/Object;
    .locals 5

    new-instance v0, Ly2/f;

    invoke-static {p2}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ly2/f;-><init>(ILg2/d;)V

    invoke-virtual {v0}, Ly2/f;->u()V

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, LB2/v;->s(LB2/x;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-gez p2, :cond_0

    iput-object v0, p1, LB2/x;->b:Ly2/f;

    goto :goto_0

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    invoke-virtual {v0, p1}, Ly2/f;->t(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    invoke-virtual {v0}, Ly2/f;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lh2/a;->d:Lh2/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final h()V
    .locals 8

    iget v0, p0, LB2/v;->i:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget v0, p0, LB2/v;->o:I

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    :goto_0
    iget v2, p0, LB2/v;->o:I

    if-lez v2, :cond_1

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v2

    iget v4, p0, LB2/v;->n:I

    iget v5, p0, LB2/v;->o:I

    add-int/2addr v4, v5

    int-to-long v6, v4

    add-long/2addr v2, v6

    const-wide/16 v6, 0x1

    sub-long/2addr v2, v6

    long-to-int v2, v2

    array-length v3, v0

    sub-int/2addr v3, v1

    and-int/2addr v2, v3

    aget-object v2, v0, v2

    sget-object v3, LB2/w;->a:LD2/w;

    if-ne v2, v3, :cond_1

    add-int/lit8 v5, v5, -0x1

    iput v5, p0, LB2/v;->o:I

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v2

    iget v4, p0, LB2/v;->n:I

    iget v5, p0, LB2/v;->o:I

    add-int/2addr v4, v5

    int-to-long v4, v4

    add-long/2addr v2, v4

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, LB2/w;->a([Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final j()V
    .locals 10

    iget-object v0, p0, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LB2/w;->a([Ljava/lang/Object;JLjava/lang/Object;)V

    iget v0, p0, LB2/v;->n:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LB2/v;->n:I

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iget-wide v2, p0, LB2/v;->l:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_0

    iput-wide v0, p0, LB2/v;->l:J

    :cond_0
    iget-wide v2, p0, LB2/v;->m:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_3

    iget v2, p0, LC2/b;->e:I

    if-eqz v2, :cond_2

    iget-object v2, p0, LC2/b;->d:[LC2/d;

    if-eqz v2, :cond_2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    check-cast v5, LB2/x;

    iget-wide v6, v5, LB2/x;->a:J

    const-wide/16 v8, 0x0

    cmp-long v8, v6, v8

    if-ltz v8, :cond_1

    cmp-long v6, v6, v0

    if-gez v6, :cond_1

    iput-wide v0, v5, LB2/x;->a:J

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iput-wide v0, p0, LB2/v;->m:J

    :cond_3
    return-void
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, LB2/v;->n:I

    iget v1, p0, LB2/v;->o:I

    add-int/2addr v0, v1

    iget-object v1, p0, LB2/v;->k:[Ljava/lang/Object;

    const/4 v2, 0x2

    if-nez v1, :cond_0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v3, v2}, LB2/v;->p([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    array-length v3, v1

    if-lt v0, v3, :cond_1

    array-length v3, v1

    mul-int/2addr v3, v2

    invoke-virtual {p0, v1, v0, v3}, LB2/v;->p([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v2

    int-to-long v4, v0

    add-long/2addr v2, v4

    invoke-static {v1, v2, v3, p1}, LB2/w;->a([Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final l([Lg2/d;)[Lg2/d;
    .locals 10

    array-length v0, p1

    iget v1, p0, LC2/b;->e:I

    if-eqz v1, :cond_3

    iget-object v1, p0, LC2/b;->d:[LC2/d;

    if-eqz v1, :cond_3

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    if-eqz v4, :cond_2

    check-cast v4, LB2/x;

    iget-object v5, v4, LB2/x;->b:Ly2/f;

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v4}, LB2/v;->s(LB2/x;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-ltz v6, :cond_2

    array-length v6, p1

    if-lt v0, v6, :cond_1

    array-length v6, p1

    const/4 v7, 0x2

    mul-int/2addr v6, v7

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v6, "copyOf(this, newSize)"

    invoke-static {p1, v6}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v6, p1

    check-cast v6, [Lg2/d;

    add-int/lit8 v7, v0, 0x1

    aput-object v5, v6, v0

    const/4 v0, 0x0

    iput-object v0, v4, LB2/x;->b:Ly2/f;

    move v0, v7

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    check-cast p1, [Lg2/d;

    return-object p1
.end method

.method public final m(Lg2/i;II)LB2/e;
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, -0x3

    if-ne p2, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    move-object v0, p0

    goto :goto_0

    :cond_1
    new-instance v0, LC2/i;

    invoke-direct {v0, p0, p1, p2, p3}, LC2/h;-><init>(LB2/e;Lg2/i;II)V

    :goto_0
    return-object v0
.end method

.method public final n()J
    .locals 4

    iget-wide v0, p0, LB2/v;->m:J

    iget-wide v2, p0, LB2/v;->l:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final o(LB2/f;Lg2/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LB2/v;->i(LB2/v;LB2/f;Lg2/d;)V

    sget-object p1, Lh2/a;->d:Lh2/a;

    return-object p1
.end method

.method public final p([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 7

    if-lez p3, :cond_2

    new-array p3, p3, [Ljava/lang/Object;

    iput-object p3, p0, LB2/v;->k:[Ljava/lang/Object;

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_1

    int-to-long v3, v2

    add-long/2addr v3, v0

    long-to-int v5, v3

    array-length v6, p1

    add-int/lit8 v6, v6, -0x1

    and-int/2addr v5, v6

    aget-object v5, p1, v5

    invoke-static {p3, v3, v4, v5}, LB2/w;->a([Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object p3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Buffer size overflow"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Ljava/lang/Object;)Z
    .locals 5

    sget-object v0, LC2/c;->a:[Lg2/d;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, LB2/v;->r(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, LB2/v;->l([Lg2/d;)[Lg2/d;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move p1, v1

    :goto_0
    monitor-exit p0

    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    sget-object v4, Lc2/m;->a:Lc2/m;

    invoke-interface {v3, v4}, Lg2/d;->t(Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return p1

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final r(Ljava/lang/Object;)Z
    .locals 12

    iget v0, p0, LC2/b;->e:I

    iget v1, p0, LB2/v;->h:I

    const/4 v9, 0x1

    if-nez v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LB2/v;->k(Ljava/lang/Object;)V

    iget v0, p0, LB2/v;->n:I

    add-int/2addr v0, v9

    iput v0, p0, LB2/v;->n:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0}, LB2/v;->j()V

    :cond_1
    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v0

    iget v2, p0, LB2/v;->n:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LB2/v;->m:J

    :goto_0
    return v9

    :cond_2
    iget v0, p0, LB2/v;->n:I

    iget v2, p0, LB2/v;->i:I

    if-lt v0, v2, :cond_5

    iget-wide v3, p0, LB2/v;->m:J

    iget-wide v5, p0, LB2/v;->l:J

    cmp-long v0, v3, v5

    if-gtz v0, :cond_5

    iget v0, p0, LB2/v;->j:I

    invoke-static {v0}, Lp/f;->b(I)I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    goto :goto_1

    :cond_3
    return v9

    :cond_4
    const/4 v0, 0x0

    return v0

    :cond_5
    :goto_1
    invoke-virtual {p0, p1}, LB2/v;->k(Ljava/lang/Object;)V

    iget v0, p0, LB2/v;->n:I

    add-int/2addr v0, v9

    iput v0, p0, LB2/v;->n:I

    if-le v0, v2, :cond_6

    invoke-virtual {p0}, LB2/v;->j()V

    :cond_6
    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v2

    iget v0, p0, LB2/v;->n:I

    int-to-long v4, v0

    add-long/2addr v2, v4

    iget-wide v4, p0, LB2/v;->l:J

    sub-long/2addr v2, v4

    long-to-int v0, v2

    if-le v0, v1, :cond_7

    const-wide/16 v0, 0x1

    add-long v1, v4, v0

    iget-wide v3, p0, LB2/v;->m:J

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v5

    iget v0, p0, LB2/v;->n:I

    int-to-long v7, v0

    add-long/2addr v5, v7

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v7

    iget v0, p0, LB2/v;->n:I

    int-to-long v10, v0

    add-long/2addr v7, v10

    iget v0, p0, LB2/v;->o:I

    int-to-long v10, v0

    add-long/2addr v7, v10

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, LB2/v;->u(JJJJ)V

    :cond_7
    return v9
.end method

.method public final s(LB2/x;)J
    .locals 6

    iget-wide v0, p1, LB2/x;->a:J

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v2

    iget p1, p0, LB2/v;->n:I

    int-to-long v4, p1

    add-long/2addr v2, v4

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    return-wide v0

    :cond_0
    iget p1, p0, LB2/v;->i:I

    const-wide/16 v2, -0x1

    if-lez p1, :cond_1

    return-wide v2

    :cond_1
    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v4

    cmp-long p1, v0, v4

    if-lez p1, :cond_2

    return-wide v2

    :cond_2
    iget p1, p0, LB2/v;->o:I

    if-nez p1, :cond_3

    return-wide v2

    :cond_3
    return-wide v0
.end method

.method public final t(LB2/x;)Ljava/lang/Object;
    .locals 8

    sget-object v0, LC2/c;->a:[Lg2/d;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, LB2/v;->s(LB2/x;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-gez v3, :cond_0

    sget-object p1, LB2/w;->a:LD2/w;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-wide v3, p1, LB2/x;->a:J

    iget-object v0, p0, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    long-to-int v5, v1

    array-length v6, v0

    add-int/lit8 v6, v6, -0x1

    and-int/2addr v5, v6

    aget-object v0, v0, v5

    instance-of v5, v0, LB2/t;

    if-eqz v5, :cond_1

    check-cast v0, LB2/t;

    iget-object v0, v0, LB2/t;->f:Ljava/lang/Object;

    :cond_1
    const-wide/16 v5, 0x1

    add-long/2addr v1, v5

    iput-wide v1, p1, LB2/x;->a:J

    invoke-virtual {p0, v3, v4}, LB2/v;->v(J)[Lg2/d;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_0
    monitor-exit p0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    if-eqz v3, :cond_2

    sget-object v4, Lc2/m;->a:Lc2/m;

    invoke-interface {v3, v4}, Lg2/d;->t(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-object p1

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final u(JJJJ)V
    .locals 6

    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v2

    :goto_0
    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    iget-object v4, p0, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-static {v4, v2, v3, v5}, LB2/w;->a([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    goto :goto_0

    :cond_0
    iput-wide p1, p0, LB2/v;->l:J

    iput-wide p3, p0, LB2/v;->m:J

    sub-long p1, p5, v0

    long-to-int p1, p1

    iput p1, p0, LB2/v;->n:I

    sub-long/2addr p7, p5

    long-to-int p1, p7

    iput p1, p0, LB2/v;->o:I

    return-void
.end method

.method public final v(J)[Lg2/d;
    .locals 22

    move-object/from16 v9, p0

    iget-wide v0, v9, LB2/v;->m:J

    cmp-long v0, p1, v0

    sget-object v1, LC2/c;->a:[Lg2/d;

    if-lez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual/range {p0 .. p0}, LB2/v;->n()J

    move-result-wide v2

    iget v0, v9, LB2/v;->n:I

    int-to-long v4, v0

    add-long/2addr v4, v2

    iget v0, v9, LB2/v;->i:I

    const-wide/16 v6, 0x1

    if-nez v0, :cond_1

    iget v8, v9, LB2/v;->o:I

    if-lez v8, :cond_1

    add-long/2addr v4, v6

    :cond_1
    iget v8, v9, LC2/b;->e:I

    if-eqz v8, :cond_3

    iget-object v8, v9, LC2/b;->d:[LC2/d;

    if-eqz v8, :cond_3

    array-length v11, v8

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v11, :cond_3

    aget-object v13, v8, v12

    if-eqz v13, :cond_2

    check-cast v13, LB2/x;

    iget-wide v13, v13, LB2/x;->a:J

    const-wide/16 v15, 0x0

    cmp-long v15, v13, v15

    if-ltz v15, :cond_2

    cmp-long v15, v13, v4

    if-gez v15, :cond_2

    move-wide v4, v13

    :cond_2
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_3
    iget-wide v11, v9, LB2/v;->m:J

    cmp-long v8, v4, v11

    if-gtz v8, :cond_4

    return-object v1

    :cond_4
    invoke-virtual/range {p0 .. p0}, LB2/v;->n()J

    move-result-wide v11

    iget v8, v9, LB2/v;->n:I

    int-to-long v13, v8

    add-long/2addr v11, v13

    iget v8, v9, LC2/b;->e:I

    if-lez v8, :cond_5

    sub-long v13, v11, v4

    long-to-int v8, v13

    iget v13, v9, LB2/v;->o:I

    sub-int v8, v0, v8

    invoke-static {v13, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    goto :goto_1

    :cond_5
    iget v8, v9, LB2/v;->o:I

    :goto_1
    iget v13, v9, LB2/v;->o:I

    int-to-long v13, v13

    add-long/2addr v13, v11

    sget-object v15, LB2/w;->a:LD2/w;

    if-lez v8, :cond_9

    new-array v1, v8, [Lg2/d;

    iget-object v10, v9, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v10}, Lp2/g;->b(Ljava/lang/Object;)V

    move-wide/from16 v16, v4

    move-wide v4, v11

    move-wide v6, v4

    const/4 v11, 0x0

    :goto_2
    cmp-long v12, v6, v13

    if-gez v12, :cond_8

    long-to-int v12, v6

    move-wide/from16 v18, v13

    array-length v13, v10

    add-int/lit8 v13, v13, -0x1

    and-int/2addr v12, v13

    aget-object v12, v10, v12

    if-eq v12, v15, :cond_7

    const-string v13, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"

    invoke-static {v12, v13}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, LB2/t;

    add-int/lit8 v13, v11, 0x1

    iget-object v14, v12, LB2/t;->g:Ly2/f;

    aput-object v14, v1, v11

    invoke-static {v10, v6, v7, v15}, LB2/w;->a([Ljava/lang/Object;JLjava/lang/Object;)V

    iget-object v11, v12, LB2/t;->f:Ljava/lang/Object;

    invoke-static {v10, v4, v5, v11}, LB2/w;->a([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v20, 0x1

    add-long v11, v4, v20

    if-ge v13, v8, :cond_6

    move-wide v4, v11

    move v11, v13

    goto :goto_4

    :cond_6
    :goto_3
    move-object v10, v1

    goto :goto_5

    :cond_7
    const-wide/16 v20, 0x1

    :goto_4
    add-long v6, v6, v20

    move-wide/from16 v13, v18

    goto :goto_2

    :cond_8
    move-wide/from16 v18, v13

    move-object v10, v1

    move-wide v11, v4

    goto :goto_5

    :cond_9
    move-wide/from16 v16, v4

    move-wide/from16 v18, v13

    goto :goto_3

    :goto_5
    sub-long v1, v11, v2

    long-to-int v1, v1

    iget v2, v9, LC2/b;->e:I

    if-nez v2, :cond_a

    move-wide v3, v11

    goto :goto_6

    :cond_a
    move-wide/from16 v3, v16

    :goto_6
    iget-wide v5, v9, LB2/v;->l:J

    iget v2, v9, LB2/v;->h:I

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-long v1, v1

    sub-long v1, v11, v1

    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    if-nez v0, :cond_b

    cmp-long v0, v1, v18

    if-gez v0, :cond_b

    iget-object v0, v9, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    long-to-int v5, v1

    array-length v6, v0

    add-int/lit8 v6, v6, -0x1

    and-int/2addr v5, v6

    aget-object v0, v0, v5

    invoke-static {v0, v15}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-wide/16 v5, 0x1

    add-long/2addr v11, v5

    add-long/2addr v1, v5

    :cond_b
    move-wide v5, v11

    move-object/from16 v0, p0

    move-wide/from16 v7, v18

    invoke-virtual/range {v0 .. v8}, LB2/v;->u(JJJJ)V

    invoke-virtual/range {p0 .. p0}, LB2/v;->h()V

    array-length v0, v10

    if-nez v0, :cond_c

    goto :goto_7

    :cond_c
    invoke-virtual {v9, v10}, LB2/v;->l([Lg2/d;)[Lg2/d;

    move-result-object v10

    :goto_7
    return-object v10
.end method
