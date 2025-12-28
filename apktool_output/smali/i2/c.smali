.class public abstract Li2/c;
.super Li2/a;
.source "SourceFile"


# instance fields
.field public final e:Lg2/i;

.field public transient f:Lg2/d;


# direct methods
.method public constructor <init>(Lg2/d;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Lg2/d;->o()Lg2/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Li2/c;-><init>(Lg2/d;Lg2/i;)V

    return-void
.end method

.method public constructor <init>(Lg2/d;Lg2/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Li2/a;-><init>(Lg2/d;)V

    .line 2
    iput-object p2, p0, Li2/c;->e:Lg2/i;

    return-void
.end method


# virtual methods
.method public m()V
    .locals 4

    iget-object v0, p0, Li2/c;->f:Lg2/d;

    if-eqz v0, :cond_2

    if-eq v0, p0, :cond_2

    invoke-virtual {p0}, Li2/c;->o()Lg2/i;

    move-result-object v1

    sget-object v2, Lg2/e;->d:Lg2/e;

    invoke-interface {v1, v2}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v1

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    check-cast v1, Lg2/f;

    check-cast v0, LD2/g;

    :cond_0
    sget-object v1, LD2/g;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LD2/a;->d:LD2/w;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/f;

    if-eqz v1, :cond_1

    check-cast v0, Ly2/f;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ly2/f;->p()V

    :cond_2
    sget-object v0, Li2/b;->d:Li2/b;

    iput-object v0, p0, Li2/c;->f:Lg2/d;

    return-void
.end method

.method public o()Lg2/i;
    .locals 1

    iget-object v0, p0, Li2/c;->e:Lg2/i;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    return-object v0
.end method
