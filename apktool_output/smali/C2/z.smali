.class public final LC2/z;
.super LB2/v;
.source "SourceFile"

# interfaces
.implements LB2/E;


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-wide v1, p0, LB2/v;->l:J

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v3

    iget v5, p0, LB2/v;->n:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    iget-wide v5, p0, LB2/v;->l:J

    sub-long/2addr v3, v5

    long-to-int v3, v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    long-to-int v1, v1

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final w(I)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-wide v1, p0, LB2/v;->l:J

    invoke-virtual {p0}, LB2/v;->n()J

    move-result-wide v3

    iget v5, p0, LB2/v;->n:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    iget-wide v5, p0, LB2/v;->l:J

    sub-long/2addr v3, v5

    long-to-int v3, v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    long-to-int v1, v1

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, LB2/v;->q(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
