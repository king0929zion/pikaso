.class public final Lr/l;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic h:Lr/e;


# direct methods
.method public constructor <init>(Lr/e;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lr/l;->h:Lr/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 1

    new-instance p2, Lr/l;

    iget-object v0, p0, Lr/l;->h:Lr/e;

    invoke-direct {p2, v0, p1}, Lr/l;-><init>(Lr/e;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lr/l;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lr/l;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lr/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/l;->h:Lr/e;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lr/e;->e:Z

    const/4 v0, 0x0

    iget-object p1, p1, Lr/e;->g:LG2/d;

    invoke-virtual {p1, v0}, LG2/d;->d(Ljava/lang/Object;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
