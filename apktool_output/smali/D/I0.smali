.class public abstract synthetic LD/I0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB0/a;

.field public static final b:LB0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB0/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LB0/a;-><init>(I)V

    sput-object v0, LD/I0;->a:LB0/a;

    new-instance v0, LB0/a;

    invoke-direct {v0, v1}, LB0/a;-><init>(I)V

    sput-object v0, LD/I0;->b:LB0/a;

    return-void
.end method
