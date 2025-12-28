.class public final Ly2/a0;
.super LD2/b;
.source "SourceFile"


# instance fields
.field public final b:Ly2/W;

.field public c:Ly2/d0;

.field public final synthetic d:Ly2/b0;

.field public final synthetic e:Ly2/N;


# direct methods
.method public constructor <init>(Ly2/W;Ly2/b0;Ly2/N;)V
    .locals 0

    iput-object p2, p0, Ly2/a0;->d:Ly2/b0;

    iput-object p3, p0, Ly2/a0;->e:Ly2/N;

    invoke-direct {p0}, LD2/b;-><init>()V

    iput-object p1, p0, Ly2/a0;->b:Ly2/W;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    check-cast p1, LD2/k;

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Ly2/a0;->b:Ly2/W;

    if-eqz p2, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Ly2/a0;->c:Ly2/d0;

    :goto_1
    if-eqz v1, :cond_4

    sget-object v2, LD2/k;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v2, p1, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz p2, :cond_4

    iget-object p1, p0, Ly2/a0;->c:Ly2/d0;

    invoke-static {p1}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, LD2/k;->k(LD2/k;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_2

    :cond_4
    :goto_2
    return-void
.end method

.method public final c(Ljava/lang/Object;)LD2/w;
    .locals 1

    check-cast p1, LD2/k;

    iget-object p1, p0, Ly2/a0;->d:Ly2/b0;

    invoke-virtual {p1}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ly2/a0;->e:Ly2/N;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object p1, LD2/a;->e:LD2/w;

    :goto_0
    return-object p1
.end method
