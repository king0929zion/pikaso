.class public final LD2/g;
.super Ly2/A;
.source "SourceFile"

# interfaces
.implements Li2/d;
.implements Lg2/d;


# static fields
.field public static final k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _reusableCancellableContinuation:Ljava/lang/Object;

.field public final g:Ly2/r;

.field public final h:Li2/c;

.field public i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation"

    const-class v2, LD2/g;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LD2/g;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ly2/r;Li2/c;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Ly2/A;-><init>(I)V

    iput-object p1, p0, LD2/g;->g:Ly2/r;

    iput-object p2, p0, LD2/g;->h:Li2/c;

    sget-object p1, LD2/a;->c:LD2/w;

    iput-object p1, p0, LD2/g;->i:Ljava/lang/Object;

    invoke-interface {p2}, Lg2/d;->o()Lg2/i;

    move-result-object p1

    invoke-static {p1}, LD2/a;->l(Lg2/i;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LD2/g;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    instance-of v0, p1, Ly2/n;

    if-eqz v0, :cond_0

    check-cast p1, Ly2/n;

    iget-object p1, p1, Ly2/n;->b:Lo2/c;

    invoke-interface {p1, p2}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c()Lg2/d;
    .locals 0

    return-object p0
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LD2/g;->i:Ljava/lang/Object;

    sget-object v1, LD2/a;->c:LD2/w;

    iput-object v1, p0, LD2/g;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final j()Li2/d;
    .locals 1

    iget-object v0, p0, LD2/g;->h:Li2/c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final o()Lg2/i;
    .locals 1

    iget-object v0, p0, LD2/g;->h:Li2/c;

    invoke-interface {v0}, Lg2/d;->o()Lg2/i;

    move-result-object v0

    return-object v0
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, LD2/g;->h:Li2/c;

    invoke-interface {v0}, Lg2/d;->o()Lg2/i;

    move-result-object v1

    invoke-static {p1}, Lc2/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v4, p1

    goto :goto_0

    :cond_0
    new-instance v4, Ly2/m;

    invoke-direct {v4, v2, v3}, Ly2/m;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    iget-object v2, p0, LD2/g;->g:Ly2/r;

    invoke-virtual {v2}, Ly2/r;->g()Z

    move-result v5

    if-eqz v5, :cond_1

    iput-object v4, p0, LD2/g;->i:Ljava/lang/Object;

    iput v3, p0, Ly2/A;->f:I

    invoke-virtual {v2, v1, p0}, Ly2/r;->d(Lg2/i;Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_1
    invoke-static {}, Ly2/k0;->a()Ly2/J;

    move-result-object v1

    invoke-virtual {v1}, Ly2/J;->t()Z

    move-result v2

    if-eqz v2, :cond_2

    iput-object v4, p0, LD2/g;->i:Ljava/lang/Object;

    iput v3, p0, Ly2/A;->f:I

    invoke-virtual {v1, p0}, Ly2/J;->m(Ly2/A;)V

    goto :goto_3

    :cond_2
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ly2/J;->p(Z)V

    :try_start_0
    invoke-interface {v0}, Lg2/d;->o()Lg2/i;

    move-result-object v3

    iget-object v4, p0, LD2/g;->j:Ljava/lang/Object;

    invoke-static {v3, v4}, LD2/a;->m(Lg2/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v0, p1}, Li2/a;->t(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v3, v4}, LD2/a;->g(Lg2/i;Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {v1}, Ly2/J;->x()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_3

    :goto_1
    invoke-virtual {v1, v2}, Ly2/J;->j(Z)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-static {v3, v4}, LD2/a;->g(Lg2/i;Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    const/4 v0, 0x0

    :try_start_4
    invoke-virtual {p0, p1, v0}, Ly2/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :goto_3
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1, v2}, Ly2/J;->j(Z)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DispatchedContinuation["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LD2/g;->g:Ly2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LD2/g;->h:Li2/c;

    invoke-static {v1}, Ly2/v;->p(Lg2/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
