.class public final Lo1/e;
.super LZ0/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lo1/f;


# direct methods
.method public constructor <init>(Lo1/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/e;->c:Lo1/f;

    return-void
.end method


# virtual methods
.method public final I(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lo1/e;->c:Lo1/f;

    iget-object v0, v0, Lo1/f;->a:Lo1/i;

    invoke-virtual {v0, p1}, Lo1/i;->e(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final J(LD1/w;)V
    .locals 6

    iget-object v0, p0, Lo1/e;->c:Lo1/f;

    iput-object p1, v0, Lo1/f;->c:LD1/w;

    new-instance p1, LB0/a;

    iget-object v1, v0, Lo1/f;->c:LD1/w;

    iget-object v2, v0, Lo1/f;->a:Lo1/i;

    iget-object v3, v2, Lo1/i;->g:LX1/e;

    iget-object v2, v2, Lo1/i;->i:Lo1/d;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x22

    if-lt v4, v5, :cond_0

    invoke-static {}, Lo1/n;->a()Ljava/util/Set;

    move-result-object v4

    goto :goto_0

    :cond_0
    invoke-static {}, LZ/b;->s()Ljava/util/Set;

    move-result-object v4

    :goto_0
    invoke-direct {p1, v1, v3, v2, v4}, LB0/a;-><init>(LD1/w;LX1/e;Lo1/d;Ljava/util/Set;)V

    iput-object p1, v0, Lo1/f;->b:LB0/a;

    iget-object p1, v0, Lo1/f;->a:Lo1/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p1, Lo1/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x1

    :try_start_0
    iput v1, p1, Lo1/i;->c:I

    iget-object v1, p1, Lo1/i;->b:Ln/g;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p1, Lo1/i;->b:Ln/g;

    invoke-virtual {v1}, Ln/g;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p1, Lo1/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v1, p1, Lo1/i;->d:Landroid/os/Handler;

    new-instance v2, La1/a;

    iget p1, p1, Lo1/i;->c:I

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, La1/a;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    iget-object p1, p1, Lo1/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
