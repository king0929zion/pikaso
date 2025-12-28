.class public final LG2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/e;
.implements Ly2/p0;


# instance fields
.field public final d:Ly2/f;

.field public final e:Ljava/lang/Object;

.field public final synthetic f:LG2/d;


# direct methods
.method public constructor <init>(LG2/d;Ly2/f;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG2/c;->f:LG2/d;

    iput-object p2, p0, LG2/c;->d:Ly2/f;

    iput-object p3, p0, LG2/c;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LD2/u;I)V
    .locals 1

    iget-object v0, p0, LG2/c;->d:Ly2/f;

    invoke-virtual {v0, p1, p2}, Ly2/f;->a(LD2/u;I)V

    return-void
.end method

.method public final d(Ljava/lang/Object;Lo2/c;)LD2/w;
    .locals 2

    check-cast p1, Lc2/m;

    new-instance p2, LG2/b;

    iget-object v0, p0, LG2/c;->f:LG2/d;

    const/4 v1, 0x1

    invoke-direct {p2, v0, p0, v1}, LG2/b;-><init>(LG2/d;LG2/c;I)V

    iget-object v1, p0, LG2/c;->d:Ly2/f;

    invoke-virtual {v1, p1, p2}, Ly2/f;->d(Ljava/lang/Object;Lo2/c;)LD2/w;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p2, LG2/d;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v1, p0, LG2/c;->e:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lo2/c;)V
    .locals 2

    sget-object p1, Lc2/m;->a:Lc2/m;

    sget-object p2, LG2/d;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v0, p0, LG2/c;->f:LG2/d;

    iget-object v1, p0, LG2/c;->e:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, LG2/b;

    const/4 v1, 0x0

    invoke-direct {p2, v0, p0, v1}, LG2/b;-><init>(LG2/d;LG2/c;I)V

    iget-object v0, p0, LG2/c;->d:Ly2/f;

    invoke-virtual {v0, p1, p2}, Ly2/f;->g(Ljava/lang/Object;Lo2/c;)V

    return-void
.end method

.method public final o()Lg2/i;
    .locals 1

    iget-object v0, p0, LG2/c;->d:Ly2/f;

    iget-object v0, v0, Ly2/f;->h:Lg2/i;

    return-object v0
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LG2/c;->d:Ly2/f;

    invoke-virtual {v0, p1}, Ly2/f;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public final w(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LG2/c;->d:Ly2/f;

    invoke-virtual {v0, p1}, Ly2/f;->w(Ljava/lang/Object;)V

    return-void
.end method
