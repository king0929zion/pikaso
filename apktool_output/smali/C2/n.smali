.class public final LC2/n;
.super LC2/h;
.source "SourceFile"


# instance fields
.field public final h:Li2/j;


# direct methods
.method public constructor <init>(Lo2/f;LB2/e;Lg2/i;II)V
    .locals 0

    invoke-direct {p0, p2, p3, p4, p5}, LC2/h;-><init>(LB2/e;Lg2/i;II)V

    check-cast p1, Li2/j;

    iput-object p1, p0, LC2/n;->h:Li2/j;

    return-void
.end method


# virtual methods
.method public final a(Lg2/i;II)LC2/h;
    .locals 7

    new-instance v6, LC2/n;

    iget-object v1, p0, LC2/n;->h:Li2/j;

    iget-object v2, p0, LC2/h;->g:LB2/e;

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, LC2/n;-><init>(Lo2/f;LB2/e;Lg2/i;II)V

    return-object v6
.end method

.method public final c(LB2/f;Li2/c;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LC2/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LC2/m;-><init>(LC2/n;LB2/f;Lg2/d;)V

    invoke-static {v0, p2}, Ly2/v;->b(Lo2/e;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lh2/a;->d:Lh2/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
