.class public final Lo0/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/p;
.implements Landroidx/lifecycle/p;


# instance fields
.field public final d:Lo0/u;

.field public final e:LD/t;

.field public f:Z

.field public g:Landroidx/lifecycle/t;

.field public h:LL/a;


# direct methods
.method public constructor <init>(Lo0/u;LD/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/b1;->d:Lo0/u;

    iput-object p2, p0, Lo0/b1;->e:LD/t;

    sget-object p1, Lo0/d0;->a:LL/a;

    iput-object p1, p0, Lo0/b1;->h:LL/a;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 0

    sget-object p1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lo0/b1;->e()V

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    if-ne p2, p1, :cond_1

    iget-boolean p1, p0, Lo0/b1;->f:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lo0/b1;->h:LL/a;

    invoke-virtual {p0, p1}, Lo0/b1;->f(LL/a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final e()V
    .locals 8

    iget-boolean v0, p0, Lo0/b1;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo0/b1;->f:Z

    iget-object v0, p0, Lo0/b1;->d:Lo0/u;

    invoke-virtual {v0}, Lo0/u;->getView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0801c9

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Lo0/b1;->g:Landroidx/lifecycle/t;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/q;)V

    :cond_0
    iget-object v0, p0, Lo0/b1;->e:LD/t;

    iget-object v1, v0, LD/t;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, LD/t;->t:LD/n;

    iget-boolean v2, v2, LD/n;->C:Z

    const/4 v3, 0x0

    if-nez v2, :cond_6

    iget-boolean v2, v0, LD/t;->u:Z

    if-nez v2, :cond_5

    const/4 v2, 0x1

    iput-boolean v2, v0, LD/t;->u:Z

    sget-object v4, LD/j;->b:LL/a;

    iget-object v4, v0, LD/t;->i:LD/B0;

    iget v4, v4, LD/B0;->e:I

    const/4 v5, 0x0

    if-lez v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_0
    if-nez v4, :cond_2

    iget-object v6, v0, LD/t;->h:Ln/A;

    iget-object v6, v6, Ln/A;->d:Ln/B;

    invoke-virtual {v6}, Ln/B;->g()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_1
    new-instance v6, LD/s;

    iget-object v7, v0, LD/t;->h:Ln/A;

    invoke-direct {v6, v7}, LD/s;-><init>(Ln/A;)V

    if-eqz v4, :cond_3

    iget-object v4, v0, LD/t;->i:LD/B0;

    invoke-virtual {v4}, LD/B0;->c()LD/D0;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v4, v6}, LD/d;->D(LD/D0;LD/s;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v4, v2}, LD/D0;->e(Z)V

    iget-object v2, v0, LD/t;->e:LB0/a;

    invoke-virtual {v2}, LB0/a;->d()V

    iget-object v2, v0, LD/t;->e:LB0/a;

    invoke-virtual {v2}, LB0/a;->A()V

    invoke-virtual {v6}, LD/s;->e()V

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v4, v5}, LD/D0;->e(Z)V

    throw v0

    :cond_3
    :goto_2
    invoke-virtual {v6}, LD/s;->d()V

    :cond_4
    iget-object v2, v0, LD/t;->t:LD/n;

    invoke-virtual {v2}, LD/n;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    monitor-exit v1

    iget-object v1, v0, LD/t;->d:LD/q;

    check-cast v1, LD/v0;

    iget-object v2, v1, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_3
    iget-object v4, v1, LD/v0;->e:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iput-object v3, v1, LD/v0;->f:Ljava/lang/Object;

    iget-object v3, v1, LD/v0;->h:LF/d;

    invoke-virtual {v3, v0}, LF/d;->l(Ljava/lang/Object;)Z

    iget-object v1, v1, LD/v0;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit v2

    return-void

    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_6
    :try_start_4
    const-string v0, "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."

    invoke-static {v0}, LD/d;->I(Ljava/lang/String;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    monitor-exit v1

    throw v0
.end method

.method public final f(LL/a;)V
    .locals 2

    new-instance v0, LD/g;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1, p1}, LD/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p0, Lo0/b1;->d:Lo0/u;

    invoke-virtual {p1, v0}, Lo0/u;->setOnViewTreeOwnersAvailable(Lo2/c;)V

    return-void
.end method
