.class public final Lz0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/e;


# instance fields
.field public final a:Ls1/c;

.field public final b:Lz0/q;

.field public final c:LB2/i;

.field public final d:Lz0/i;

.field public final e:Lk/H;


# direct methods
.method public constructor <init>(Ls1/c;Lz0/a;)V
    .locals 5

    sget-object v0, Lz0/g;->a:LB2/i;

    new-instance v1, Lz0/i;

    sget-object v2, Lz0/g;->a:LB2/i;

    sget-object v2, Lg2/j;->d:Lg2/j;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sget-object v3, LC0/h;->a:Lz2/c;

    sget-object v4, Lz0/i;->a:Lz0/h;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3}, LZ0/d;->K(Lg2/g;Lg2/i;)Lg2/i;

    move-result-object v3

    invoke-interface {v3, v2}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object v2

    new-instance v3, Ly2/i0;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ly2/V;-><init>(Ly2/S;)V

    invoke-interface {v2, v3}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object v2

    invoke-static {v2}, Ly2/v;->a(Lg2/i;)LD2/d;

    new-instance v2, Lk/H;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lk/H;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/f;->a:Ls1/c;

    iput-object p2, p0, Lz0/f;->b:Lz0/q;

    iput-object v0, p0, Lz0/f;->c:LB2/i;

    iput-object v1, p0, Lz0/f;->d:Lz0/i;

    iput-object v2, p0, Lz0/f;->e:Lk/H;

    new-instance p1, LD/y;

    const/16 p2, 0x17

    invoke-direct {p1, p2, p0}, LD/y;-><init>(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/s;)Lz0/t;
    .locals 6

    iget-object v0, p0, Lz0/f;->c:LB2/i;

    iget-object v1, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v1, LX1/e;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v2, Lo1/p;

    invoke-virtual {v2, p1}, Lo1/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz0/t;

    if-eqz v2, :cond_2

    iget-boolean v3, v2, Lz0/t;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v3, :cond_0

    monitor-exit v1

    goto/16 :goto_7

    :cond_0
    :try_start_1
    iget-object v2, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v2, Lo1/p;

    iget-object v3, v2, Lo1/p;->e:Ljava/lang/Object;

    check-cast v3, LX1/e;

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v4, v2, Lo1/p;->f:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v2, Lo1/p;->g:Ljava/lang/Object;

    check-cast v5, Ljava/util/LinkedHashSet;

    invoke-virtual {v5, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lo1/p;->e()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    iput v5, v2, Lo1/p;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_3
    monitor-exit v3

    check-cast v4, Lz0/t;

    goto :goto_2

    :catchall_1
    move-exception p1

    goto/16 :goto_9

    :goto_1
    monitor-exit v3

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_2
    :goto_2
    monitor-exit v1

    :try_start_4
    iget-object v1, p0, Lz0/f;->d:Lz0/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lz0/f;->e:Lk/H;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p1, Lz0/s;->a:Lz0/r;

    if-nez v2, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    instance-of v3, v2, Lz0/c;

    :goto_3
    iget-object v1, v1, Lk/H;->b:Ljava/lang/Object;

    check-cast v1, Ls1/c;

    iget v4, p1, Lz0/s;->c:I

    iget-object v5, p1, Lz0/s;->b:Lz0/l;

    if-eqz v3, :cond_4

    iget v1, v1, Ls1/c;->a:I

    packed-switch v1, :pswitch_data_0

    const/4 v1, 0x0

    invoke-static {v1, v5, v4}, Ls1/c;->f(Ljava/lang/String;Lz0/l;I)Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_4

    :pswitch_0
    const/4 v1, 0x0

    invoke-static {v1, v5, v4}, Ls1/c;->e(Ljava/lang/String;Lz0/l;I)Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_4

    :cond_4
    instance-of v3, v2, Lz0/n;

    if-eqz v3, :cond_5

    check-cast v2, Lz0/n;

    invoke-virtual {v1, v2, v5, v4}, Ls1/c;->g(Lz0/n;Lz0/l;I)Landroid/graphics/Typeface;

    move-result-object v1

    :goto_4
    new-instance v2, Lz0/t;

    invoke-direct {v2, v1}, Lz0/t;-><init>(Landroid/graphics/Typeface;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    move-object v2, v1

    :goto_5
    if-eqz v2, :cond_7

    iget-object v1, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v1, LX1/e;

    monitor-enter v1

    :try_start_5
    iget-object v3, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v3, Lo1/p;

    invoke-virtual {v3, p1}, Lo1/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_6

    iget-boolean v3, v2, Lz0/t;->e:Z

    if-eqz v3, :cond_6

    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Lo1/p;

    invoke-virtual {v0, p1, v2}, Lo1/p;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception p1

    goto :goto_8

    :cond_6
    :goto_6
    monitor-exit v1

    :goto_7
    return-object v2

    :goto_8
    monitor-exit v1

    throw p1

    :cond_7
    :try_start_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Could not load font"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not load font"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_9
    monitor-exit v1

    throw p1

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lz0/r;Lz0/l;II)Lz0/t;
    .locals 7

    new-instance v6, Lz0/s;

    iget-object v0, p0, Lz0/f;->b:Lz0/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p2}, Lz0/q;->a(Lz0/l;)Lz0/l;

    move-result-object v2

    iget-object p2, p0, Lz0/f;->a:Ls1/c;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lz0/s;-><init>(Lz0/r;Lz0/l;IILjava/lang/Object;)V

    invoke-virtual {p0, v6}, Lz0/f;->a(Lz0/s;)Lz0/t;

    move-result-object p1

    return-object p1
.end method
