.class public final LG1/g;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic e:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, LG1/g;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p2, p0, LG1/g;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LD/d;->J(I)I

    move-result p2

    invoke-static {p2, p1}, Lr2/a;->e(ILD/n;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
