.class public final LG1/f;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:LD/Z;


# direct methods
.method public constructor <init>(LD/Z;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LG1/f;->i:LD/Z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 1

    new-instance p2, LG1/f;

    iget-object v0, p0, LG1/f;->i:LD/Z;

    invoke-direct {p2, v0, p1}, LG1/f;-><init>(LD/Z;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LG1/f;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LG1/f;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LG1/f;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lh2/a;->d:Lh2/a;

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, LG1/f;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    :cond_2
    sget-boolean p1, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v1, p0, LG1/f;->i:LD/Z;

    invoke-interface {v1, p1}, LD/Z;->setValue(Ljava/lang/Object;)V

    iput v2, p0, LG1/f;->h:I

    const-wide/16 v3, 0x3e8

    invoke-static {v3, v4, p0}, Ly2/v;->c(JLi2/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0
.end method
