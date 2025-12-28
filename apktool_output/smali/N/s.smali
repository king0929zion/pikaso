.class public final LN/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/y;
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Lq2/c;


# instance fields
.field public d:LN/q;


# virtual methods
.method public final a(LN/A;)V
    .locals 1

    iget-object v0, p0, LN/s;->d:LN/q;

    iput-object v0, p1, LN/A;->b:LN/A;

    check-cast p1, LN/q;

    iput-object p1, p0, LN/s;->d:LN/q;

    return-void
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 7

    .line 27
    :cond_0
    sget-object v0, LN/t;->a:Ljava/lang/Object;

    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    iget-object v1, p0, LN/s;->d:LN/q;

    .line 30
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-static {v1}, LN/o;->i(LN/A;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    .line 32
    iget v2, v1, LN/q;->d:I

    .line 33
    iget-object v1, v1, LN/q;->c:LH/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 34
    monitor-exit v0

    .line 35
    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    .line 36
    invoke-virtual {v1, p1, p2}, LH/c;->b(ILjava/lang/Object;)LH/c;

    move-result-object v3

    .line 37
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 38
    :cond_1
    iget-object v1, p0, LN/s;->d:LN/q;

    .line 39
    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    sget-object v4, LN/o;->b:Ljava/lang/Object;

    .line 41
    monitor-enter v4

    .line 42
    :try_start_1
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v5

    .line 43
    invoke-static {v1, p0, v5}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    .line 44
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    :try_start_2
    iget v6, v1, LN/q;->d:I

    if-ne v6, v2, :cond_2

    .line 46
    iput-object v3, v1, LN/q;->c:LH/c;

    .line 47
    iget v2, v1, LN/q;->e:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 48
    iput v2, v1, LN/q;->e:I

    add-int/lit8 v6, v6, 0x1

    .line 49
    iput v6, v1, LN/q;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 50
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    .line 51
    invoke-static {v5, p0}, LN/o;->n(LN/h;LN/y;)V

    if-eqz v3, :cond_0

    :goto_1
    return-void

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 52
    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    :cond_0
    sget-object v0, LN/t;->a:Ljava/lang/Object;

    .line 2
    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, LN/s;->d:LN/q;

    .line 4
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {v1}, LN/o;->i(LN/A;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    .line 6
    iget v2, v1, LN/q;->d:I

    .line 7
    iget-object v1, v1, LN/q;->c:LH/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    monitor-exit v0

    .line 9
    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {v1, p1}, LH/c;->c(Ljava/lang/Object;)LH/c;

    move-result-object v3

    .line 11
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    .line 12
    :cond_1
    iget-object v1, p0, LN/s;->d:LN/q;

    .line 13
    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v5, LN/o;->b:Ljava/lang/Object;

    .line 15
    monitor-enter v5

    .line 16
    :try_start_1
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v6

    .line 17
    invoke-static {v1, p0, v6}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    .line 18
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    :try_start_2
    iget v7, v1, LN/q;->d:I

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    .line 20
    iput-object v3, v1, LN/q;->c:LH/c;

    .line 21
    iget v2, v1, LN/q;->e:I

    add-int/2addr v2, v8

    .line 22
    iput v2, v1, LN/q;->e:I

    add-int/lit8 v7, v7, 0x1

    .line 23
    iput v7, v1, LN/q;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v4, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 24
    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 25
    invoke-static {v6, p0}, LN/o;->n(LN/h;LN/y;)V

    if-eqz v4, :cond_0

    move v4, v8

    :goto_1
    return v4

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 26
    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1

    .line 1
    new-instance v0, LN/r;

    invoke-direct {v0, p1, p2}, LN/r;-><init>(ILjava/util/Collection;)V

    invoke-virtual {p0, v0}, LN/s;->f(Lo2/c;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 9

    .line 2
    :cond_0
    sget-object v0, LN/t;->a:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LN/s;->d:LN/q;

    .line 5
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {v1}, LN/o;->i(LN/A;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    .line 7
    iget v2, v1, LN/q;->d:I

    .line 8
    iget-object v1, v1, LN/q;->c:LH/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    monitor-exit v0

    .line 10
    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {v1, p1}, LH/c;->d(Ljava/util/Collection;)LH/c;

    move-result-object v3

    .line 12
    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    .line 13
    :cond_1
    iget-object v1, p0, LN/s;->d:LN/q;

    .line 14
    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v5, LN/o;->b:Ljava/lang/Object;

    .line 16
    monitor-enter v5

    .line 17
    :try_start_1
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v6

    .line 18
    invoke-static {v1, p0, v6}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    .line 19
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :try_start_2
    iget v7, v1, LN/q;->d:I

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    .line 21
    iput-object v3, v1, LN/q;->c:LH/c;

    .line 22
    iget v2, v1, LN/q;->e:I

    add-int/2addr v2, v8

    .line 23
    iput v2, v1, LN/q;->e:I

    add-int/lit8 v7, v7, 0x1

    .line 24
    iput v7, v1, LN/q;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v4, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 25
    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 26
    invoke-static {v6, p0}, LN/o;->n(LN/h;LN/y;)V

    if-eqz v4, :cond_0

    move v4, v8

    :goto_1
    return v4

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 27
    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b()LN/A;
    .locals 1

    iget-object v0, p0, LN/s;->d:LN/q;

    return-object v0
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, LN/s;->d:LN/q;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LN/o;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v2

    invoke-static {v0, p0, v2}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v0

    check-cast v0, LN/q;

    sget-object v3, LN/t;->a:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v4, LH/j;->e:LH/j;

    iput-object v4, v0, LN/q;->c:LH/c;

    iget v4, v0, LN/q;->d:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, LN/q;->d:I

    iget v4, v0, LN/q;->e:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, LN/q;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    invoke-static {v2, p0}, LN/o;->n(LN/h;LN/y;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit v1

    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, LN/s;->d()LN/q;

    move-result-object v0

    iget-object v0, v0, LN/q;->c:LH/c;

    invoke-virtual {v0, p1}, LH/c;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, LN/s;->d()LN/q;

    move-result-object v0

    iget-object v0, v0, LN/q;->c:LH/c;

    invoke-virtual {v0, p1}, LH/c;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final d()LN/q;
    .locals 2

    iget-object v0, p0, LN/s;->d:LN/q;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, LN/o;->t(LN/A;LN/y;)LN/A;

    move-result-object v0

    check-cast v0, LN/q;

    return-object v0
.end method

.method public final e()I
    .locals 2

    iget-object v0, p0, LN/s;->d:LN/q;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LN/o;->i(LN/A;)LN/A;

    move-result-object v0

    check-cast v0, LN/q;

    iget v0, v0, LN/q;->e:I

    return v0
.end method

.method public final f(Lo2/c;)Z
    .locals 8

    :cond_0
    sget-object v0, LN/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LN/s;->d:LN/q;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LN/o;->i(LN/A;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    iget v2, v1, LN/q;->d:I

    iget-object v1, v1, LN/q;->c:LH/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, LH/c;->e()LH/g;

    move-result-object v3

    invoke-interface {p1, v3}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, LH/g;->c()LH/c;

    move-result-object v3

    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LN/s;->d:LN/q;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LN/o;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_1
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v6

    invoke-static {v1, p0, v6}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v7, v1, LN/q;->d:I

    if-ne v7, v2, :cond_1

    iput-object v3, v1, LN/q;->c:LH/c;

    add-int/lit8 v7, v7, 0x1

    iput v7, v1, LN/q;->d:I

    iget v2, v1, LN/q;->e:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, v1, LN/q;->e:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    invoke-static {v6, p0}, LN/o;->n(LN/h;LN/y;)V

    if-eqz v3, :cond_0

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    monitor-exit v5

    throw p1

    :cond_2
    :goto_3
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/s;->d()LN/q;

    move-result-object v0

    iget-object v0, v0, LN/q;->c:LH/c;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, LN/s;->d()LN/q;

    move-result-object v0

    iget-object v0, v0, LN/q;->c:LH/c;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, LN/s;->d()LN/q;

    move-result-object v0

    iget-object v0, v0, LN/q;->c:LH/c;

    check-cast v0, Ld2/a;

    invoke-virtual {v0}, Ld2/a;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LN/s;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, LN/s;->d()LN/q;

    move-result-object v0

    iget-object v0, v0, LN/q;->c:LH/c;

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 2

    .line 1
    new-instance v0, LN/x;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LN/x;-><init>(LN/s;I)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 2
    new-instance v0, LN/x;

    invoke-direct {v0, p0, p1}, LN/x;-><init>(LN/s;I)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, LN/s;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 2
    :cond_0
    sget-object v1, LN/t;->a:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v2, p0, LN/s;->d:LN/q;

    .line 5
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {v2}, LN/o;->i(LN/A;)LN/A;

    move-result-object v2

    check-cast v2, LN/q;

    .line 7
    iget v3, v2, LN/q;->d:I

    .line 8
    iget-object v2, v2, LN/q;->c:LH/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    monitor-exit v1

    .line 10
    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {v2, p1}, LH/c;->g(I)LH/c;

    move-result-object v4

    .line 12
    invoke-static {v4, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 13
    :cond_1
    iget-object v2, p0, LN/s;->d:LN/q;

    .line 14
    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v5, LN/o;->b:Ljava/lang/Object;

    .line 16
    monitor-enter v5

    .line 17
    :try_start_1
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v6

    .line 18
    invoke-static {v2, p0, v6}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v2

    check-cast v2, LN/q;

    .line 19
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :try_start_2
    iget v7, v2, LN/q;->d:I

    if-ne v7, v3, :cond_2

    .line 21
    iput-object v4, v2, LN/q;->c:LH/c;

    .line 22
    iget v3, v2, LN/q;->e:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    .line 23
    iput v3, v2, LN/q;->e:I

    add-int/lit8 v7, v7, 0x1

    .line 24
    iput v7, v2, LN/q;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 25
    :goto_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 26
    invoke-static {v6, p0}, LN/o;->n(LN/h;LN/y;)V

    if-eqz v4, :cond_0

    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 27
    :goto_2
    :try_start_4
    monitor-exit v1

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 9

    .line 28
    :cond_0
    sget-object v0, LN/t;->a:Ljava/lang/Object;

    .line 29
    monitor-enter v0

    .line 30
    :try_start_0
    iget-object v1, p0, LN/s;->d:LN/q;

    .line 31
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {v1}, LN/o;->i(LN/A;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    .line 33
    iget v2, v1, LN/q;->d:I

    .line 34
    iget-object v1, v1, LN/q;->c:LH/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 35
    monitor-exit v0

    .line 36
    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    .line 37
    invoke-virtual {v1, p1}, Ld2/d;->indexOf(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 38
    invoke-virtual {v1, v3}, LH/c;->g(I)LH/c;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v1

    .line 39
    :goto_0
    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    goto :goto_2

    .line 40
    :cond_2
    iget-object v1, p0, LN/s;->d:LN/q;

    .line 41
    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    sget-object v5, LN/o;->b:Ljava/lang/Object;

    .line 43
    monitor-enter v5

    .line 44
    :try_start_1
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v6

    .line 45
    invoke-static {v1, p0, v6}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    .line 46
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    :try_start_2
    iget v7, v1, LN/q;->d:I

    const/4 v8, 0x1

    if-ne v7, v2, :cond_3

    .line 48
    iput-object v3, v1, LN/q;->c:LH/c;

    .line 49
    iget v2, v1, LN/q;->e:I

    add-int/2addr v2, v8

    .line 50
    iput v2, v1, LN/q;->e:I

    add-int/lit8 v7, v7, 0x1

    .line 51
    iput v7, v1, LN/q;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v4, v8

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 52
    :cond_3
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 53
    invoke-static {v6, p0}, LN/o;->n(LN/h;LN/y;)V

    if-eqz v4, :cond_0

    move v4, v8

    :goto_2
    return v4

    :catchall_1
    move-exception p1

    goto :goto_4

    .line 54
    :goto_3
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 9

    :cond_0
    sget-object v0, LN/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LN/s;->d:LN/q;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LN/o;->i(LN/A;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    iget v2, v1, LN/q;->d:I

    iget-object v1, v1, LN/q;->c:LH/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    new-instance v3, LH/b;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p1}, LH/b;-><init>(ILjava/util/Collection;)V

    invoke-virtual {v1, v3}, LH/c;->f(LH/b;)LH/c;

    move-result-object v3

    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, LN/s;->d:LN/q;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LN/o;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_1
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v6

    invoke-static {v1, p0, v6}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v1

    check-cast v1, LN/q;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v7, v1, LN/q;->d:I

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    iput-object v3, v1, LN/q;->c:LH/c;

    iget v2, v1, LN/q;->e:I

    add-int/2addr v2, v8

    iput v2, v1, LN/q;->e:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v1, LN/q;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v4, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    invoke-static {v6, p0}, LN/o;->n(LN/h;LN/y;)V

    if-eqz v4, :cond_0

    move v4, v8

    :goto_1
    return v4

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 2

    new-instance v0, LH/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, LH/b;-><init>(ILjava/util/Collection;)V

    invoke-virtual {p0, v0}, LN/s;->f(Lo2/c;)Z

    move-result p1

    return p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0, p1}, LN/s;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    sget-object v1, LN/t;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, LN/s;->d:LN/q;

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LN/o;->i(LN/A;)LN/A;

    move-result-object v2

    check-cast v2, LN/q;

    iget v3, v2, LN/q;->d:I

    iget-object v2, v2, LN/q;->c:LH/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, LH/c;->h(ILjava/lang/Object;)LH/c;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, LN/s;->d:LN/q;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LN/o;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_1
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v6

    invoke-static {v2, p0, v6}, LN/o;->w(LN/A;LN/y;LN/h;)LN/A;

    move-result-object v2

    check-cast v2, LN/q;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v7, v2, LN/q;->d:I

    if-ne v7, v3, :cond_2

    iput-object v4, v2, LN/q;->c:LH/c;

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, LN/q;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    invoke-static {v6, p0}, LN/o;->n(LN/h;LN/y;)V

    if-eqz v2, :cond_0

    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v1

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final size()I
    .locals 1

    invoke-virtual {p0}, LN/s;->d()LN/q;

    move-result-object v0

    iget-object v0, v0, LN/q;->c:LH/c;

    check-cast v0, Ld2/a;

    invoke-virtual {v0}, Ld2/a;->a()I

    move-result v0

    return v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, LN/s;->size()I

    move-result v0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, LN/C;

    invoke-direct {v0, p0, p1, p2}, LN/C;-><init>(LN/s;II)V

    return-object v0

    :cond_1
    const-string p1, "fromIndex or toIndex are out of bounds"

    invoke-static {p1}, LD/d;->H(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lp2/g;->i(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lp2/g;->j(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LN/s;->d:LN/q;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LN/o;->i(LN/A;)LN/A;

    move-result-object v0

    check-cast v0, LN/q;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SnapshotStateList(value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, LN/q;->c:LH/c;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
