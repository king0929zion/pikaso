.class public final LC2/t;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# static fields
.field public static final e:LC2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC2/t;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lp2/h;-><init>(I)V

    sput-object v0, LC2/t;->e:LC2/t;

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lg2/g;

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
